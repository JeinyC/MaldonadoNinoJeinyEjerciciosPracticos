package mainPackage;

import modelPackage.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = getProductos();

        System.out.println();

        System.out.println("Lista de productos");
        for (Producto producto : productos){
            System.out.println(producto);
        }

        System.out.println();

        Producto precioMin = productos.get(0);

        for (Producto producto: productos){
            if (producto.getPrecio() < precioMin.getPrecio()){
                precioMin = producto;
            }
        }

        System.out.println("Producto de menor precio");
        System.out.println(precioMin);

        System.out.println();

        Producto precioMax = productos.get(0);

        for (Producto producto: productos){
            if (producto.getPrecio() > precioMax.getPrecio()){
                precioMax = producto;
            }
        }

        System.out.println("Producto de mayor precio");
        System.out.println(precioMax);

        System.out.println();

        System.out.println("Lista de productos tras eliminar uno");
        productos.remove(5);
        for (Producto producto : productos){
            System.out.println(producto);
        }

        System.out.println();


        Producto stockMax = productos.get(0);

        for (Producto producto : productos){
            if(producto.getStock() > stockMax.getStock()){
                stockMax = producto;
            }
        }

        System.out.println("Producto con mayor cantidad de Stock");
        System.out.println(stockMax);

        System.out.println();

        int actualizarStock = stockMax.getStock() - 3;
        stockMax.setStock(actualizarStock);

        System.out.println();

        System.out.println("Producto con mayor cantidad de Stock actualizado");
        System.out.println(stockMax);

        System.out.println();

        System.out.println("Lista de productos final");
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }

    private static ArrayList<Producto> getProductos() {
        ArrayList<Producto> productos = new ArrayList<>();

        Producto cpu = new Producto(1, "Procesador AMD Ryzen 7 5800X", "AMD", 1, 399.99, 25);
        Producto gpu = new Producto(2, "Tarjeta gráfica NVIDIA GeForce RTX 3080", "NVIDIA", 2, 799.99, 15);
        Producto ram = new Producto(3, "Memoria RAM Corsair Vengeance RGB Pro 16GB (2x8GB)", "Corsair", 3, 129.99, 30);
        Producto motherboard = new Producto(4, "Placa base ASUS ROG Strix X570-E Gaming", "ASUS", 4, 299.99, 20);
        Producto ssd = new Producto(5, "Unidad de estado sólido Samsung 970 EVO Plus 1TB", "Samsung", 5, 149.99, 40);
        Producto hdd = new Producto(6, "Disco duro Seagate Barracuda 2TB", "Seagate", 6, 69.99, 50);
        Producto psu = new Producto(7, "Fuente de alimentación EVGA Supernova 750 G5", "EVGA", 7, 119.99, 25);
        Producto casePc = new Producto(8, "Torre NZXT H510", "NZXT", 8, 69.99, 35);
        Producto cooler = new Producto(9, "Ventilador para CPU Cooler Master Hyper 212 RGB", "Cooler Master", 9, 39.99, 45);
        Producto monitor = new Producto(10, "Monitor gaming ASUS TUF Gaming VG27WQ1B", "ASUS", 10, 349.99, 18);

        productos.add(cpu);
        productos.add(gpu);
        productos.add(motherboard);
        productos.add(ssd);
        productos.add(hdd);
        productos.add(psu);
        productos.add(casePc);
        productos.add(cooler);
        productos.add(monitor);
        productos.add(ram);
        return productos;
    }
}