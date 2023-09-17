package sys.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
  import javax.faces.bean.ViewScoped;
import sys.dao.ProductDAO;
import sys.impl.ProductDAOImpl;
import sys.modelo.Product;

@ManagedBean
@Named(value = "productoBean")
@ViewScoped

public class ProductBean {

    private Product producto = null;
    private List<Product> productos = null;

    public ProductBean() {
    }

    public List<Product> getProducts() {

        ProductDAO datos = new ProductDAOImpl();
        this.productos = datos.select();
        return productos;

    }
    
       public void prepareProduct() {
        this.producto = new Product();
    }

    public void insertProduct() {
        ProductDAO datos = new ProductDAOImpl();
        datos.insert(producto);
    }

    public void updateProduct() {
        ProductDAO datos = new ProductDAOImpl();
        datos.update(producto);
        this.producto = new Product();
    }

    public void deleteProduct() {
        ProductDAO datos = new ProductDAOImpl();
        datos.delete(producto);
        this.producto = new Product();
    }

    public Product getProduct() {
        return producto;
    }

    public void setProduct(Product product) {
        this.producto = product;
    }

    public void setProducts(List<Product> products) {
        this.productos = products;
    }

 

}
