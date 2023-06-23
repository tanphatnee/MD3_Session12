package baitaptonghop.run;

import baitaptonghop.config.Config;
import baitaptonghop.database.Data;
import baitaptonghop.model.Color;
import baitaptonghop.model.Product;
import baitaptonghop.service.ColorService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColorManagement {
    private static List<Color> colorList = Data.color;

    private static ColorService colorService = new ColorService();

    private static List<Product > products = Data.product_data;

    public static void main(String[] args) {
        colorList.add(new Color(1, "xanh lá"));
        products.add(new Product(1, "prd name", 15.5, 15, null, new Color(1, "xanh lá"), null));

        int choice;
        while (true){
            show();
            System.out.println("1. thêm mới");
            System.out.println("2. sửa theo id");
            System.out.println("3. xóa");
            System.out.println("4. trở về");
            choice = Config.getInteger();
            switch (choice){
                case 1: createColor();
                    break;
                case 2: edit();
                    break;
                case 3: delete();
                    break;


                case 4:return;
            }
        }
    }

    static void createColor(){
        System.out.println("nhập màu: ");
        String color = Config.getString();
        Color color1 = new Color(color);
        boolean check = colorService.save(colorList, color1);
        if (check){
            System.out.println("lưu thành công");
        }else System.out.println("lưu thất bại");
    }

    static void edit(){
        System.out.println("nhập id màu muốn sửa: ");
        int id = Config.getInteger();
        Color color = colorService.findById(colorList, id);
        if (color == null){
            System.out.println("không tìm thấy màu này ");
        }else {
            System.out.println("nhaafp tên màu mới: ");
            String colorStr = Config.getString();
            color.setColorName(colorStr);
            colorService.save(colorList, color);
        }
    }

    static void delete(){
        System.out.println("nhập id màu muốn xóa: ");
        int id = Config.getInteger();
        boolean check = colorService.deleteById(colorList, id);
        if (check){
            System.out.println(" xóa thành công");
        }else System.out.println("xóa thất bại");
    }

    static void show(){
        Map<String, Integer> map = colorService.atributeWithPrd(colorList, Data.product_data);
        Set<String> strings = map.keySet();
        for (String str: strings) {
            System.out.println(str + ": " + map.get(str) + " sản phẩm");
        }
    }

}
