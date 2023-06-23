package baitaptonghop.service;

import baitaptonghop.model.Color;
import baitaptonghop.model.Product;
import baitaptonghop.model.RootModel;

import java.util.List;
import java.util.Map;

public interface IBaseService<E extends RootModel>{

    Map<String, Integer> atributeWithPrd(List<Color> colors, List<Product> products);

    default boolean save(List<E> eList, E e){
        if (e == null) {
            return false;
        }
        if (e.getId() != 0){
            for (int i = 0; i < eList.size(); i++) {
                if (eList.get(i).getId() == e.getId()){
                    eList.set(i, e);
                    return true;
                }
            }
        }else {
            e.setId(idAutoIncrement(eList));
            eList.add(e);
            return true;
        }
        return false;
    }

    default E findById(List<E> eList, int id){
        for (E element: eList) {
            if (element.getId() == id){
                return element;
            }
        }
        return null;
    }

    default boolean deleteById(List<E> eList, int id){
        for (E element: eList) {
            if (element.getId() == id){
                eList.remove(element);
                return true;
            }
        }
        return false;
    }


    default Integer idAutoIncrement(List<E> eList){
        int idMax = 0;
        for (int i = 0; i < eList.size(); i++) {
            if (eList.get(i).getId() > idMax){
                idMax = eList.get(i).getId();
            }
        }
        return idMax + 1;
    }



}
