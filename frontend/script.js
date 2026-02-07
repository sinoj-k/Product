const api_url = "/api/product";


function addProduct() {
    const name = document.getElementById("name").value;
    const description = document.getElementById("description").value;

    fetch(api_url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ name, description })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById("result").innerText = JSON.stringify(data, null, 2);
    });
}

function getProduct() {
    const id = document.getElementById("productId").value;

    fetch(`${api_url}/${id}`)
    .then(response => response.json())
    .then(data => {
        document.getElementById("result").innerText = JSON.stringify(data, null, 2);
    });
}
