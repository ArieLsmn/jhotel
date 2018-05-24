package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
public class PesananController {

    /**
     *
     *
     * @param id_customer id customer
     * @return pesan
     */
    @RequestMapping("/pesanancustomer/{id_customer}")
    public Pesanan pesananCust(@PathVariable int id_customer) {
        Pesanan pesan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesan;
    }

    /**
     *
     *
     * @param id_pesanan id pesanan
     * @return pesan
     */
    @RequestMapping("/pesanan/{id_pesanan}")
    public Pesanan getPesanan(@PathVariable int id_pesanan) {
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        return pesan;
    }

    /**
     *
     *
     * @param jumlah_hari durasi pesanan
     * @param id_customer id customer
     * @param id_hotel id hotel
     * @param nomor_kamar nomer kamar
     * @return
     */
    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value="jumlah_hari") double jumlah_hari,
                               @RequestParam(value="id_customer") int id_customer,
                               @RequestParam(value="id_hotel") int id_hotel,
                               @RequestParam(value = "nomor_kamar") String nomor_kamar) {
        Pesanan pesan = new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer));

        try {
            DatabasePesanan.addPesanan(pesan);
            Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)),
                    DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));
            pesan.setTanggalPesan(new GregorianCalendar().getTime());
            pesan.setBiaya();

        } catch(PesananSudahAdaException ex) {
            ex.getMessage();
            return null;
        };
        Pesanan aktif = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return aktif;
    }

    /**
     *
     *
     * @param id_pesanan id pesanan yang ingin dicancel
     * @return pesanan
     */
    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan cancelPesanan(@RequestParam(value="id_pesanan") int id_pesanan){
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    /**
     *
     *
     * @param id_pesanan id pesanan yang akan diselesaikan
     * @return pesanan
     */
    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan finishPesanan(@RequestParam(value="id_pesanan") int id_pesanan){
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}