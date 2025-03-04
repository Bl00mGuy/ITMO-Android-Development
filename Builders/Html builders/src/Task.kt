fun renderProductTable(): String {
    return html {
        table {
            tr {
                td(color = getTitleColor()) {
                    text("Product")
                }
                td(color = getTitleColor()) {
                    text("Price")
                }
                td(color = getTitleColor()) {
                    text("Popularity")
                }
            }

            val products = getProducts()
            for ((index, product) in products.withIndex()) {
                tr {
                    td(color = getCellColor(index, 0)) {
                        text(product.description)
                    }
                    td(color = getCellColor(index, 1)) {
                        text(product.price.toString())
                    }
                    td(color = getCellColor(index, 2)) {
                        text(product.popularity.toString())
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"