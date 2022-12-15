<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <linl rel="stylesheet" href="index.css"></link>
    <title>Document</title>
    <style type="text/css">
    .style1 {
        color:#FF0000;
        font-size:36px;
    }

    .style2 {
        color:#0000FF;
        font-size:24px;
    }

    .style3 {
        color:#000000;
        font-size:32px;
        font-weight:bold;
    }
    </style>
</head>
<body>
    <p class = "style1">VIDEO AULAS JAVA EE</p>
    <p>&nbsp;</p>
    <p class = "style2">Prof Neri Neitzke</p>
    <p class = "style2">&nbsp;</p>
    <p class = "style3">www.informaticon.com.br</p>

    <% 
        out.println("<h1>Bem vindos ao mundo java... Neri</h1>"); 
		out.println("<p>Bem vindos ao mundo java... Neri</p>"); 
		String nome = "Lisiane Batista Neitzke";
		int num1 = 2;
		int num2 = 45;
		int soma = num1 + num2;
		out.println("O nome da pessoa é:"+nome);
		out.println("<br>");
		out.println("A soma é "+soma);
		out.println("<br>"); 
		double n1=7.5,  n2=8.5, media = 0;
		media = (n1 +  n2)/2;
		
		if (media >= 6) {
			out.println("O aluno foi aprovado, com média "+media);
		}
		
		else {
			out.println("O aluno foi reprovado, com média "+media);
		}
		
		out.println("<br>");
		
		for (int i=1; i<5; i++) 
			
			out.println("<h"+i+">"+"Estamos aprendendo java para web"+"</h"+i+">");
		
		out.println("<br>");
		out.println("<br>");

		String [] cliente =  {"Neri","Lisiane","Gustavo","Giulia","Romilda","Selvino"};
		
		for(int i = 0; i < cliente.length ;i++)
			out.println(cliente[i]+"<br>");
		
		
		out.println("<br>");
		out.println("<br>");
		
		int q = 0;
		while (q < cliente.length) {
			
			out.println(cliente[q]+"<br>");
			q++;
			
		}

			
    %>


    <p class = "style2">&nbsp;</p>
    <p class = "style2">Ulbra Universidade - Campus Carazinho</p>
	
	
</body>
</html>