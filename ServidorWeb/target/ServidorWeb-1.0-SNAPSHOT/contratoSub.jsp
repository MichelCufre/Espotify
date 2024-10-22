<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Planes de Suscripci�n Espotify</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            color: #212529;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .hero {
            background: linear-gradient(135deg, #4caf50, #66bb6a);
            color: white;
            padding: 4rem 0;
        }
        .plan-card {
            height: 100%;
            border: none;
            border-radius: 15px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease-in-out;
        }
        .plan-card:hover {
            transform: translateY(-5px);
        }
        .card-title {
            color: #1DB954;
            font-weight: bold;
        }
        .btn-choose {
            background-color: #1DB954;
            border-color: #1DB954;
            border-radius: 25px;
            padding: 0.5rem 2rem;
            font-weight: bold;
            transition: all 0.3s ease;
        }
        .btn-choose:hover {
            background-color: #1ed760;
            border-color: #1ed760;
            transform: scale(1.05);
        }
        .feature-icon {
            color: #1DB954;
            margin-right: 0.5rem;
        }
        .table {
            border-radius: 15px;
            overflow: hidden;
        }
        .table thead {
            background-color: #1DB954;
            color: white;
        }
    </style>
</head>
<body>
    <jsp:include page="/template/header.jsp" />
        <div class="container">  
            <h1></h1>
        </div>

    <section class="hero text-center">
        <div class="container">
            <h1 class="display-4 fw-bold mb-4">Elige tu plan perfecto</h1>
            <p class="lead">Desbloquea todo el potencial de tu experiencia musical con Espotify</p>
        </div>
    </section>

    <div class="container py-5">
        <div class="row row-cols-1 row-cols-md-3 g-4 mb-5">
            <div class="col">
                <div class="card plan-card">
                    <div class="card-body d-flex flex-column">
                        <h2 class="card-title">Semanal</h2>
                        <p class="card-text fs-2 fw-bold mb-4">$0.99 <small class="text-muted fs-6 fw-normal">/semana</small></p>
                        <button class="btn btn-choose text-white mb-4">Elegir plan</button>
                        <ul class="list-unstyled mt-auto">
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> 7 dias horas de m�sica sin anuncios</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Escucha sin conexi�n por un d�a</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Audio de alta calidad</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Acceso a todas las funciones</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card plan-card">
                    <div class="card-body d-flex flex-column">
                        <h2 class="card-title">Mensual</h2>
                        <p class="card-text fs-2 fw-bold mb-4">$4.99 <small class="text-muted fs-6 fw-normal">/mes</small></p>
                        <button class="btn btn-choose text-white mb-4">Elegir plan</button>
                        <ul class="list-unstyled mt-auto">
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> 30 d�as de m�sica sin anuncios</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Escucha sin conexi�n por una semana</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Audio de alta calidad</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Acceso a todas las funciones</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card plan-card">
                    <div class="card-body d-flex flex-column">
                        <h2 class="card-title">Anual</h2>
                        <p class="card-text fs-2 fw-bold mb-4">$9.99 <small class="text-muted fs-6 fw-normal">/a�o</small></p>
                        <button class="btn btn-choose text-white mb-4">Elegir plan</button>
                        <ul class="list-unstyled mt-auto">
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Un a�o de m�sica sin anuncios</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Escucha sin conexi�n ilimitada</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Audio de la m�s alta calidad</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Acceso a todas las funciones</li>
                            <li class="mb-2"><i class="fas fa-check feature-icon"></i> Contenido exclusivo pa vos pap�</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <h2 class="text-center mb-4">Compara los planes</h2>
        <div class="table-responsive">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Funci�n</th>
                        <th class="text-center">Semanal</th>
                        <th class="text-center">Mensual</th>
                        <th class="text-center">Anual</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>M�sica sin anuncios</td>
                        <td class="text-center"><i class="fas fa-check text-success"></i></td>
                        <td class="text-center"><i class="fas fa-check text-success"></i></td>
                        <td class="text-center"><i class="fas fa-check text-success"></i></td>
                    </tr>
                    <tr>
                        <td>Escucha sin conexi�n</td>
                        <td class="text-center">Limitada</td>
                        <td class="text-center">Limitada</td>
                        <td class="text-center">Ilimitada</td>
                    </tr>
                    <tr>
                        <td>Calidad de audio</td>
                        <td class="text-center">Alta</td>
                        <td class="text-center">Alta</td>
                        <td class="text-center">La m�s alta</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>