import com.bigcorp.project.data.contract.AddressService;

/**
 * Décrit pati patou ....
 * @uses AddressService
 */
module com.bigcorp.project.graphics{
	
	requires com.bigcorp.project.business;
	
	// Utile pour la fonctionnalité d'envoi de courrier
	uses AddressService;
}