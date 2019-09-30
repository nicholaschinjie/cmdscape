
const express = require('express')
const app = express()

console.log("server live")
app.use(express.static('public'))
app.listen(3000, () => console.log('Server running on port 3000'))
