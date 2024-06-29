package dao;

import model.Pedido;
import java.util.List;
public interface PedidoDAO {
    void crearPedido (Pedido pedido);
    Pedido obtenerPedido(int id);
    List<Pedido> listarPedidos();
    void actualizarPedido(Pedido pedido);
    void eliminarPedido(int id);

}
