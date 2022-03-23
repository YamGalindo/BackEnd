package dao;

import java.util.ArrayList;

public interface Dao <T>{
    T guardar(T t);
    ArrayList<T> consultar();
}
