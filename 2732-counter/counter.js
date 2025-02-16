/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let num;
    return function() {
        if(num==null) num= n;
        else num++;
        return num;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */