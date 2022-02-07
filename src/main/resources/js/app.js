document.addEventListener("DOMContentLoaded", function() {

const text = document.getElementById('text');
const updateid = document.getElementById('updateid');
const todoform = document.getElementById('todoform');
const todoupdateform = document.getElementById('todoupdateform');



todoform.addEventListener('sumbit', (e) =>{
let messages =[];
if(text.value === '' || text.value == null){

messages.push('Field cannot be empty')
}
if(messages.length >0){
e.preventDefault();
}
})
}