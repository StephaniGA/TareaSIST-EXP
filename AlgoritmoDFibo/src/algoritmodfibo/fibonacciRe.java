/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmodfibo;

/**
 *
 * @author stephany GA
 */
public class fibonacciRe {
    //manera de desicion 
          public static long fibonacci (int n){
          if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
    
}
