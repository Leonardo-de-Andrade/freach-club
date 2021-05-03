package complemento;

/**
 *
 * @author Leonardo
 */
public interface DAOMASTER<T> {

    public boolean salvar(T o);

    public boolean atualizar(T o);

    public boolean excluir(int id);

    public T consultarId(int id);

}
