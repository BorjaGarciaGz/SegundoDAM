import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {





        try {
            Connection cn = crearConexion();
            Producto p = new Producto("producto de prueba", 12, 10);
           // insertarConexion(p, cn);
            if(modificarPrecioProducto(11, 120, cn)>10)
            System.out.println("Conexion a la base de datos");

        }  catch (SQLException e) {
            System.out.println("Error de SQL: "+e.getMessage());
        }
    }


    public static Connection crearConexion() throws SQLException {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root", "101599");

            return cn;
        }

        public static int modificarPrecioProducto(int idProducto, double precioNuevo, Connection cn) throws SQLException {
            String sql = "UPDATE productos SET precio = ? WHERE id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setDouble(1, precioNuevo);
            ps.setInt(2, idProducto);


            return ps.executeUpdate();
        }

        public static ArrayList<Producto> obtenerProductos(Connection cn) throws SQLException {
             String sql = "SELECT nombre, precio, cantidad\n FROM productos";
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             ArrayList<Producto> productos = new ArrayList<>();
             while (rs.next()) {
                 Producto p = new Producto(rs.getString(1), rs.getDouble("precio"), rs.getInt(3));
                 productos.add(p);
             }
             return productos;
        }

        public static void insertarConexion (Producto producto, Connection n)  throws SQLException {
            String sql = "INSERT INTO productos\n (nombre, precio, cantidad)\n VALUES (?, ?, ?)";
            PreparedStatement pst = n.prepareStatement(sql);
            pst.setString(1, producto.getNombre());
            pst.setDouble(2, producto.getPrecio());
            pst.setInt(3, producto.getCantidad());
            pst.execute();
        }