const express = require('express')
router = express.Router()

const Taskcontroller =require('../controllers/Taskcontroller')

router.get('/all',Taskcontroller.showtask)

router.get('/create',Taskcontroller.createtask)
router.post('/create',Taskcontroller.createtasksave)

router.get('/edit/:idtask',Taskcontroller.edittask)
router.post('/edit',Taskcontroller.edittasksave)

router.post('/done',Taskcontroller.donetoggle)

router.post('/delete',Taskcontroller.deletetask)


module.exports = router