 String nome = "";
	  
	   System.out.println("Digite Seu Nome: ");
	   nome = scan.next();
	  
	   int qtdeAmigo;
       System.out.println("Digite Quantidade De Amigos: ");
       qtdeAmigo = scan.nextInt();
		 
	   String nomeAmigo[] = new String[qtdeAmigo];
	
	   for (int i = 0; i < qtdeAmigo; i++) {
	       System.out.println("Digite o nome do " + (i + 1) + "� amigo: ");
	       nomeAmigo[i] = scan.next();		   
	   }   
	   
	   System.out.println(" Meu nome �: " + nome);
	   for (int i = 0; i < qtdeAmigo; i++) {
		System.out.println("O nome do " + (i +1) + "� �: " + nomeAmigo[i]);
	   }
	 