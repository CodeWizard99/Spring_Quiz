<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>

        .navbar{
            height: 30px;
            width: 100%;
            display: flex;
            justify-content: center;
            position: fixed;
        }

        .container{
            display: flex;
            justify-content: center;
            margin: 0px;
            padding: 100px 20px;
        }

        .component{
            padding: 0 5px;
            background-color: white;
        }

        .component a img{
            width: 50px;
            height: auto;
        }

    </style>

    <title>QuizApp</title>
</head>
<body>
    <div class="navbar">
        <h2>Spring Quiz App</h2>
    </div>
    <div class="container">
        <form method="POST">
            <div class="component">
                <a href="/quiz?topic=Computer">
                    <img src="/images/undraw_content_team_3epn.svg">
                </a>
            </div>
            <div class="component">
                <a href="/quiz?topic=World+Capital">
                    <img src="/images/undraw_Eiffel_tower_3gw8.svg">
                </a>
            </div>
        </form>
    </div>
</body>
</html>