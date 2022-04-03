const  intro= document.getElementById('intro');
const  data= document.getElementById('data');
const  string= document.getElementById('string');
const  binary= document.getElementById('binary');
const  text= document.getElementById('text');
const  search= document.getElementById('search');
const  navIndex= document.querySelector(".navIndex");
function hideAll(){
    intro.style.display= "none";
    data.style.display= "none";
    string.style.display= "none";
    binary.style.display= "none";
    text.style.display= "none";
    search.style.display= "none";
    // intro.classList.add("hide");
    // data.classList.add("hide");
    // string.classList.add("hide");
}

navIndex.addEventListener("click", e=> {
    const ele = e.target;
    hideAll();
    if(ele.textContent== "Introduction"){
        intro.style.display= "block";
    }
    else if(ele.textContent== "Data structure") {
        data.style.display= "block";
    }
    else if(ele.textContent== "String & regex") {
        string.style.display= "block";
    }
    else if(ele.textContent== "File Binary") {
        binary.style.display= "block";
    }
    else if(ele.textContent== "File Text") {
        text.style.display= "block";
    }
    else if(ele.textContent== "Search and sort") {
        search.style.display= "block";
    }
});

// function fIntro(){
//     hideAll();
//     intro.style.display= "block";
//
// }
//
// function fData(){
//     hideAll();
//     data.style.display= "block";
//
// }
//
// function fString(){
//     hideAll();
//     string.style.display= "block";
//
// }