package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class PesananController {

    @RequestMapping(value="/pesanancustomer/{id_customer}", method=RequestMethod.GET)
    public Pesanan pesananCust(@PathVariable int id_customer){
        Pesanan pesanan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesanan;
    }

    @RequestMapping(value="/pesanan/{id_pesanan}", method=RequestMethod.GET)
    public Pesanan getPesanan(@PathVariable int id_pesanan){
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        return pesanan;
    }

    @RequestMapping(value="/buatpesanan/", method=RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value="jumlah_hari") double jumlah_hari,
                            @RequestParam(value="id_customer") int id_customer,
                            @RequestParam(value="id_hotel") int id_hotel,
                            @RequestParam(value="nomor_kamar") String nomor_kamar) {
        Pesanan pesan = new Pesanan(jumlah_hari,DatabaseCustomer.getCustomer(id_customer));
        try {
            DatabasePesanan.addPesanan(pesan);
            Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer))
                                                ,DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar));
            pesan.setTanggalPesan(new Date());
            Pesanan pesanAktif=DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
            return pesanAktif;
        }
        catch (PesananSudahAdaException e)
        {
            e.getPesan();
        }


    }
}
