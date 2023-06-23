package baitaptonghop.run;

import baitaptonghop.config.Config;
import baitaptonghop.database.Data;
import baitaptonghop.model.Color;
import baitaptonghop.model.Product;
import baitaptonghop.service.ProductService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductManagement {
    private static List<Product> productList = Data.product_data;
    private static ProductService productService = new ProductService();
    private static List<Color> ccolorList = Data.color;

    public static void main(String[] args) {
        productList.add(new Product(2, "BWM", 15000, 15, null, new Color(1, "xanh lá"), null));

        int choice;
        while (true) {
            System.out.println("1. thêm mới sản phẩm");
            System.out.println("2. sửa theo id sản phẩm");
            System.out.println("3. xóa sản phẩm");
            System.out.println("4. trở về");
            choice = Config.getInteger();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
//                    updateProduct();
                    break;
                case 3:
//                    deleteProduct();
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        }
    }

    static void addProduct() {
        System.out.println("Nhập Product muốn thêm");
        String product = Config.getString();
        Product productAdd = new Product(product);
        boolean check = productService.save(productList, productAdd);
        if (check) {
            System.out.println("Lưu thành công");
        } else System.out.println("Lưu thất bại rồi");

    }

    static void show() {
        Map<String, Integer> map = productService.atributeWithPrd(ccolorList, Data.product_data);

        Set<String> strings = map.keySet();
        for (String str:strings) {
            System.out.println(str + ": " + map.get(str) + " sản phẩm");
        }
    }
}
