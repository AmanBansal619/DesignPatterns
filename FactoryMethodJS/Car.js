export default class Car {
    constructor({compayName, color, tyreCompany}) {
        this.compayName = compayName;
        this.color = color;
        this.tyreCompany = tyreCompany;
    }
    print = () => {
        console.log(this.compayName)
        console.log(this.color)
        console.log(this.tyreCompany)
    }
}