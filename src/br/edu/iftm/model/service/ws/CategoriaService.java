package br.edu.iftm.model.service.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.edu.iftm.model.dao.CategoriaDao;
import br.edu.iftm.model.domain.Categoria;
import br.edu.iftm.model.service.ICategoriaService;

@WebService(serviceName="ws/categoria")
public class CategoriaService implements ICategoriaService {

	@Inject
	private CategoriaDao categoriaDao;
	
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.service.ICategoriaService#salvar(br.edu.iftm.model.domain.Categoria)
	 */
	@Override
	@WebMethod
	public void  salvar(@WebParam(name="categoria") Categoria categoria){
		categoriaDao.salvar(categoria);
	}
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.service.ICategoriaService#atualizar(br.edu.iftm.model.domain.Categoria)
	 */
	@Override
	@WebMethod
	public void  atualizar(@WebParam(name="categoria") Categoria categoria){
		categoriaDao.atualizar(categoria);
	}
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.service.ICategoriaService#excluir(br.edu.iftm.model.domain.Categoria)
	 */
	@Override
	@WebMethod
	public void  excluir(@WebParam(name="categoria") Categoria categoria){
		categoriaDao.excluir(categoria);
	}
	/* (non-Javadoc)
	 * @see br.edu.iftm.model.service.ICategoriaService#buscar(br.edu.iftm.model.domain.Categoria)
	 */
	@Override
	@WebMethod
	public List<Categoria> buscar(@WebParam(name="categoria")Categoria categoria){
		return categoriaDao.buscar(categoria);
	}
}
