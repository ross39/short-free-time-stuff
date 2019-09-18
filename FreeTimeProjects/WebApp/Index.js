//To create a close button and add it to each item on the list
var myList = document.getElementByTagName("LI");
var i;
for(i = o; i < myList.length; i++){
  var span = document.createElement("SPAN");
  var txt = document.createTextNode("X");
  span.className="close";
  span.appendChild(txt);
  myList[i].appendChild(span);
}

//Click on a close button to hide the current list item
var close = document.getElementByClassName("Close");
var i;
for(i = 0; i < close.length; i++){
  close[i].onclick = function() {
    var div = this.parentElement;
    div.style.display = "None";
  }
}

//Add a checked symbol when clicking on a list item
var list = document.querySelector('ul');
list.addEventListener('click',function(ev) {
  if(ev.target.tagName === 'LI') {
    ev.target.classList.toggle('checked');
  }
}, false);

//Add button function
function newElement() {
  var x = document.createElement("x");
  var input = document.getElementById("myInput").value;

  var y = document.createTextNode(input);
  li.appendChild(y);

  if(input === ''){
    alert("You must Write something");
  }
  else{
    document.getElementById("myUL").appendChild(li);
  }
  document.getElementById("myInput").value = "";

  var span = document.createElement("SPAN");
  var txt = document.createTextNode("Hi");
  span.className = "close";
  span.appendChild(txt);
  li.apppendChild(span);

  for(i = 0; i < close.length; i++){
    close[i].onclick = function() {
      var div = this.parentElement;
      div.style.displat = "none";
    }
  }
}
