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
    

    
       <%
		String vnome, vidade;
		vnome = request.getParameter("nome");
		vidade = request.getParameter("anos");
		out.println("nome= "+vnome+", e a idade  ="+vidade);

	
	   %>
</body>
</html>