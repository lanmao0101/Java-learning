package com.day11.demo12;

public class ProductTest {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("手机", 1999, "华为", "P30");
        electronicProduct.show();
        System.out.println("------------------");
        Clothing clothing = new Clothing("纯棉T恤", 99, "L", "白色");
        clothing.show();
    }
}
