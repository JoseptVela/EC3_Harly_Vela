package com.idat.Evaluacion03.service;

import java.util.List;

import com.idat.Evaluacion03.dto.HospitalDTORequest;
import com.idat.Evaluacion03.dto.HospitalDTOResponse;

public interface HospitalService {
	
	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);

}
