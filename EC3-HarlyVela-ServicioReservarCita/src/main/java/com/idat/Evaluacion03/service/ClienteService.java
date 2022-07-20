package com.idat.Evaluacion03.service;

import java.util.List;

import com.idat.Evaluacion03.dto.ClienteDTORequest;
import com.idat.Evaluacion03.dto.ClienteDTOResponse;


public interface ClienteService {
	
	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarCliente();
	ClienteDTOResponse obtenerClienteId(Integer id);

}
