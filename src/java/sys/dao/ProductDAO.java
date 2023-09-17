/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.modelo.Product;

/**
 *
 * @author dfraga
 */
public interface ProductDAO {

    public List<Product> select();

    public void insert(Product product);

    public void update(Product product);

    public void delete(Product product);

}
