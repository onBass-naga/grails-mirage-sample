import com.area_b.samples.Customer

class BootStrap {

    def init = { servletContext ->

        Customer c = new Customer()
        c.name = "Taro Yamada"
        c.save()
        Customer c2 = new Customer()
        c2.name = "Jiro Yoshida"
        c2.save()

    }
    def destroy = {
    }
}
