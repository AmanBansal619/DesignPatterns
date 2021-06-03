import {BMW,Audi,Mercedes} from "./CarInstances.js"
export default class FactoryObject {
    constructor() {}
    createCar = ({type}) => {
        let car;
        if(type === "veryPrime") {
            car = BMW
        } else if(type === "prime") {
            car = Audi
        } else {
            car = Mercedes
        }

        car.print()
    }
}