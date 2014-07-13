/*
So this is one of the things that are extremely alien for java-developers
What this does is to create a function and then assign the variable window.onload to it
When the html-page is done rendering, the browser will call the function assigned to window.onload
*/
window.onload=function()
{
	console.log("The page has loaded");

	//Use jQuery to use ajax to call the api and populate the list with the result
	$.getJSON("api", function(data)
	{
		//This function is like a java-lambda, it will be run asynchronously after the api responds
		//data is the json
		console.log("Responded!");

		//Get a reference to the list
		var list = document.getElementById("myList");

		//lamda-like, create a function that is run for each item in the array applications
		data.applications.forEach(function(app)
		{
			//Edits the html inside the <ul> tag named myList
			list.innerHTML += "<li>" + app.name + ", " + app.space + "</li>";
		});
	});
}