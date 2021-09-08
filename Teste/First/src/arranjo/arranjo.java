package arranjo;

public class arranjo {

    public int menor(int[] a) {
    	
        int menor = a[0];
        
        for (int i = 0; i <= a.length - 1; i++){
        	 
            if ( a[i] < a[0]){
            	
                menor = a[i];
            }
            
        }
        return menor;
	}

	public int maior(int[] a) {
		
		int maior = a[0];
		
		for(int i = 0; i <= a.length - 1; i++) {
			
			if( a[i] > a[0]) {
				
				maior = a[i];
			}
			
		}
				
		return maior;
	}

	public int soma(int[] a) {
		
		int soma = 0;
		
		for(int i = 0; i <= a.length - 1; i++) {
			
			soma += a[i];

		}
		
		return soma;
	}

	public int repitacaoArray(int[] a, int n) {
		
		int copia = 0;
		
		for(int i = 0; i <= a.length - 1; i++ ) {
			
		if(a[i] == n){
			
			copia = copia + 1;
			
	
		    }
		
	    }
		
		return copia;
	}
       
}