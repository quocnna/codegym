let money = 10000;
const buyACar = (car) => {
    return new Promise(((resolve, reject) => {
        setTimeout(() => {
            if (money >= 10000) {
                resolve("can buy " + car);
            }
            else {
                reject("Do not enough money");
            }
        }, 2000);
    }));
};
money = 1000;
const promise = buyACar("Vinfast").then(value => {
    console.log(value);
}, error => {
    console.log(error);
});
console.log("parallel");
//# sourceMappingURL=main.js.map