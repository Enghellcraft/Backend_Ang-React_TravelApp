package ar.edu.unsam.algo2.grupo1.observers

import ar.edu.unsam.algo2.grupo1.itinerary.Itinerary
import ar.edu.unsam.algo2.grupo1.users.Selective
import ar.edu.unsam.algo2.grupo1.users.User

class VehicleAgreementObserver : ObserverBehaviour {

    override fun doBehaviour(user: User, itinerary: Itinerary) {
        if(!itinerary.vehicle.hasAnAgreement()) {
            user.changeVehiclePreference(Selective(itinerary.brandForAgreement()))
        }
    }
}