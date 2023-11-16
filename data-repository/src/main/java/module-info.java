import com.bigcorp.project.data.contract.AddressService;
import com.bigcorp.project.data.repository.AddressServiceImpl;

/**
 * Module d'accès aux données via SQL ...
 * @provides AddressService
 */
module com.bigcorp.project.data.repository{
	
	requires transitive com.bigcorp.project.data.contract;
	
	exports com.bigcorp.project.data.model;
	exports com.bigcorp.project.data.repository;
	
	provides AddressService with AddressServiceImpl;
}