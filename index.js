
const express = require('express')
const app = express()
<<<<<<< HEAD
app.use(express.static('public'))
=======

app.get('/', (req, res) => {
  res.send('HOST UI CODE HERE')
})

>>>>>>> a8fed4a42340e9a59723b67f3414f08965d79bf0
app.listen(3000, () => console.log('Server running on port 3000'))
