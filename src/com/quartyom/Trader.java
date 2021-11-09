package com.quartyom;

class Trader extends Human {
    private float goods_uniqueness = 0.5f; // 0 -> 1 more uniq

    public Trader(){}
    public Trader(String name, boolean is_alive, boolean is_male, int age, float goods_uniqueness){
        super(name, is_alive, is_male, age);
        set_goods_uniqueness(goods_uniqueness);
    }

    public float get_goods_uniqueness(){return goods_uniqueness;}
    public void set_goods_uniqueness(float goods_uniqueness){
        if (goods_uniqueness >= 0 && goods_uniqueness <= 1) {
            this.goods_uniqueness = goods_uniqueness;
        }
    }
    public String get_full_info(){
        String output = super.get_full_info();
        output += "Goods uniqueness : " + goods_uniqueness + '\n';
        return output;
    }
}
