package baitaptonghop.service;

import baitaptonghop.model.Color;
import baitaptonghop.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IBaseService<Product> {

    @Override
    public Map<String, Integer> atributeWithPrd(List<Color> colors, List<Product> products) {
        Map<String, Integer> map = new HashMap<>();
        for (Product product: products) {
            map.put(product.getPrdName(),0);
        }
        for (Product product: products) {
            String key =product.getPrdName();
            int value = map.get(key) + 1;
            map.put(key,value);
        }
        return map;
    }

    @Override
    public boolean save(List<Product> products, Product product) {
        return IBaseService.super.save(products, product);
    }

    @Override
    public Product findById(List<Product> products, int id) {
        return IBaseService.super.findById(products, id);
    }

    @Override
    public boolean deleteById(List<Product> products, int id) {
        return IBaseService.super.deleteById(products, id);
    }

    @Override
    public Integer idAutoIncrement(List<Product> products) {
        return IBaseService.super.idAutoIncrement(products);
    }
}
