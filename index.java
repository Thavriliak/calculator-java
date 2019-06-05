'use strict'

// user require with a reference to bundle the file and use it in this file
// var example = require('./example');

import 'bootstrap'

// allows usage of new JS features
require('babel-polyfill')

// load manifests
// scripts
require('./assets/scripts/app.js')

// styles
require('./assets/styles/index.scss')

Public class Calculator {
    double total;

    public Calculator (double totalSum){
        total = totalSum;
    }

    public double addIt(double amountToAdd){
        total = amountToAdd + total;
        return total
        System.out.println("The Sum of these numbers is: " + total);
    }

    public double subtractIt(double amountToSubtract){
        total = total - amountToSubtract;
        return total;
        System.out.println("The product of these numbers is: " + total);
    }

    public double multiplyIt(double amountToMultiply){
        total = total * amountToMultiply;
        return total;
        System.out.println("These numbers multiplied totals: " + total);
    }
}
