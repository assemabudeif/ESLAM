package com.example.eslam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ZoomControls;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.Vector;

public class AllQuran extends AppCompatActivity {

    ListView listPages;
    Button btnGoTo;
    EditText edtPageNumber;
    TextView txtPageNum;
    Vector<MyItems> items;
    ItemsArrayAdapter adapter;
    Intent in;
    TextView txtSection;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_quran);
        listPages = findViewById(R.id.listPages);
        btnGoTo = findViewById(R.id.btnGoTo);
        edtPageNumber = findViewById(R.id.edtPageNumber);
        txtPageNum = findViewById(R.id.txtPageNum);
        txtSection = findViewById(R.id.txtSection);

        setTitle("القرآن");
        in = getIntent();

        //Add Images of Quran
        {
            items = new Vector<MyItems>();
            items.add(new MyItems(R.mipmap._001));
            items.add(new MyItems(R.mipmap._002));
            items.add(new MyItems(R.mipmap._003));
            items.add(new MyItems(R.mipmap._004));
            items.add(new MyItems(R.mipmap._005));
            items.add(new MyItems(R.mipmap._006));
            items.add(new MyItems(R.mipmap._007));
            items.add(new MyItems(R.mipmap._008));
            items.add(new MyItems(R.mipmap._009));
            items.add(new MyItems(R.mipmap._010));
            items.add(new MyItems(R.mipmap._011));
            items.add(new MyItems(R.mipmap._012));
            items.add(new MyItems(R.mipmap._013));
            items.add(new MyItems(R.mipmap._014));
            items.add(new MyItems(R.mipmap._015));
            items.add(new MyItems(R.mipmap._016));
            items.add(new MyItems(R.mipmap._017));
            items.add(new MyItems(R.mipmap._018));
            items.add(new MyItems(R.mipmap._019));
            items.add(new MyItems(R.mipmap._020));
            items.add(new MyItems(R.mipmap._021));
            items.add(new MyItems(R.mipmap._022));
            items.add(new MyItems(R.mipmap._023));
            items.add(new MyItems(R.mipmap._024));
            items.add(new MyItems(R.mipmap._025));
            items.add(new MyItems(R.mipmap._026));
            items.add(new MyItems(R.mipmap._027));
            items.add(new MyItems(R.mipmap._028));
            items.add(new MyItems(R.mipmap._029));
            items.add(new MyItems(R.mipmap._030));
            items.add(new MyItems(R.mipmap._031));
            items.add(new MyItems(R.mipmap._032));
            items.add(new MyItems(R.mipmap._033));
            items.add(new MyItems(R.mipmap._034));
            items.add(new MyItems(R.mipmap._035));
            items.add(new MyItems(R.mipmap._036));
            items.add(new MyItems(R.mipmap._037));
            items.add(new MyItems(R.mipmap._038));
            items.add(new MyItems(R.mipmap._039));
            items.add(new MyItems(R.mipmap._040));
            items.add(new MyItems(R.mipmap._041));
            items.add(new MyItems(R.mipmap._042));
            items.add(new MyItems(R.mipmap._043));
            items.add(new MyItems(R.mipmap._044));
            items.add(new MyItems(R.mipmap._045));
            items.add(new MyItems(R.mipmap._046));
            items.add(new MyItems(R.mipmap._047));
            items.add(new MyItems(R.mipmap._048));
            items.add(new MyItems(R.mipmap._049));
            items.add(new MyItems(R.mipmap._050));
            items.add(new MyItems(R.mipmap._051));
            items.add(new MyItems(R.mipmap._052));
            items.add(new MyItems(R.mipmap._053));
            items.add(new MyItems(R.mipmap._054));
            items.add(new MyItems(R.mipmap._055));
            items.add(new MyItems(R.mipmap._056));
            items.add(new MyItems(R.mipmap._057));
            items.add(new MyItems(R.mipmap._058));
            items.add(new MyItems(R.mipmap._059));
            items.add(new MyItems(R.mipmap._060));
            items.add(new MyItems(R.mipmap._061));
            items.add(new MyItems(R.mipmap._062));
            items.add(new MyItems(R.mipmap._063));
            items.add(new MyItems(R.mipmap._064));
            items.add(new MyItems(R.mipmap._065));
            items.add(new MyItems(R.mipmap._066));
            items.add(new MyItems(R.mipmap._067));
            items.add(new MyItems(R.mipmap._068));
            items.add(new MyItems(R.mipmap._069));
            items.add(new MyItems(R.mipmap._070));
            items.add(new MyItems(R.mipmap._071));
            items.add(new MyItems(R.mipmap._072));
            items.add(new MyItems(R.mipmap._073));
            items.add(new MyItems(R.mipmap._074));
            items.add(new MyItems(R.mipmap._075));
            items.add(new MyItems(R.mipmap._076));
            items.add(new MyItems(R.mipmap._077));
            items.add(new MyItems(R.mipmap._078));
            items.add(new MyItems(R.mipmap._079));
            items.add(new MyItems(R.mipmap._080));
            items.add(new MyItems(R.mipmap._081));
            items.add(new MyItems(R.mipmap._082));
            items.add(new MyItems(R.mipmap._083));
            items.add(new MyItems(R.mipmap._084));
            items.add(new MyItems(R.mipmap._085));
            items.add(new MyItems(R.mipmap._086));
            items.add(new MyItems(R.mipmap._087));
            items.add(new MyItems(R.mipmap._088));
            items.add(new MyItems(R.mipmap._089));
            items.add(new MyItems(R.mipmap._090));
            items.add(new MyItems(R.mipmap._091));
            items.add(new MyItems(R.mipmap._092));
            items.add(new MyItems(R.mipmap._093));
            items.add(new MyItems(R.mipmap._094));
            items.add(new MyItems(R.mipmap._095));
            items.add(new MyItems(R.mipmap._096));
            items.add(new MyItems(R.mipmap._097));
            items.add(new MyItems(R.mipmap._098));
            items.add(new MyItems(R.mipmap._099));
            items.add(new MyItems(R.mipmap._100));
            items.add(new MyItems(R.mipmap._101));
            items.add(new MyItems(R.mipmap._102));
            items.add(new MyItems(R.mipmap._103));
            items.add(new MyItems(R.mipmap._104));
            items.add(new MyItems(R.mipmap._105));
            items.add(new MyItems(R.mipmap._106));
            items.add(new MyItems(R.mipmap._107));
            items.add(new MyItems(R.mipmap._108));
            items.add(new MyItems(R.mipmap._109));
            items.add(new MyItems(R.mipmap._110));
            items.add(new MyItems(R.mipmap._111));
            items.add(new MyItems(R.mipmap._112));
            items.add(new MyItems(R.mipmap._113));
            items.add(new MyItems(R.mipmap._114));
            items.add(new MyItems(R.mipmap._115));
            items.add(new MyItems(R.mipmap._116));
            items.add(new MyItems(R.mipmap._117));
            items.add(new MyItems(R.mipmap._118));
            items.add(new MyItems(R.mipmap._119));
            items.add(new MyItems(R.mipmap._120));
            items.add(new MyItems(R.mipmap._121));
            items.add(new MyItems(R.mipmap._122));
            items.add(new MyItems(R.mipmap._123));
            items.add(new MyItems(R.mipmap._124));
            items.add(new MyItems(R.mipmap._125));
            items.add(new MyItems(R.mipmap._126));
            items.add(new MyItems(R.mipmap._127));
            items.add(new MyItems(R.mipmap._128));
            items.add(new MyItems(R.mipmap._129));
            items.add(new MyItems(R.mipmap._130));
            items.add(new MyItems(R.mipmap._131));
            items.add(new MyItems(R.mipmap._132));
            items.add(new MyItems(R.mipmap._133));
            items.add(new MyItems(R.mipmap._134));
            items.add(new MyItems(R.mipmap.page_135));
            items.add(new MyItems(R.mipmap.page_136));
            items.add(new MyItems(R.mipmap.page_137));
            items.add(new MyItems(R.mipmap.page_138));
            items.add(new MyItems(R.mipmap.page_139));
            items.add(new MyItems(R.mipmap.page_140));
            items.add(new MyItems(R.mipmap.page_141));
            items.add(new MyItems(R.mipmap.page_142));
            items.add(new MyItems(R.mipmap.page_143));
            items.add(new MyItems(R.mipmap.page_144));
            items.add(new MyItems(R.mipmap.page_145));
            items.add(new MyItems(R.mipmap.page_146));
            items.add(new MyItems(R.mipmap.page_147));
            items.add(new MyItems(R.mipmap.page_148));
            items.add(new MyItems(R.mipmap.page_149));
            items.add(new MyItems(R.mipmap.page_150));
            items.add(new MyItems(R.mipmap.page_151));
            items.add(new MyItems(R.mipmap.page_152));
            items.add(new MyItems(R.mipmap.page_153));
            items.add(new MyItems(R.mipmap.page_154));
            items.add(new MyItems(R.mipmap.page_155));
            items.add(new MyItems(R.mipmap.page_156));
            items.add(new MyItems(R.mipmap.page_157));
            items.add(new MyItems(R.mipmap.page_158));
            items.add(new MyItems(R.mipmap.page_159));
            items.add(new MyItems(R.mipmap.page_160));
            items.add(new MyItems(R.mipmap.page_161));
            items.add(new MyItems(R.mipmap.page_162));
            items.add(new MyItems(R.mipmap.page_163));
            items.add(new MyItems(R.mipmap.page_164));
            items.add(new MyItems(R.mipmap.page_165));
            items.add(new MyItems(R.mipmap.page_166));
            items.add(new MyItems(R.mipmap.page_167));
            items.add(new MyItems(R.mipmap.page_168));
            items.add(new MyItems(R.mipmap.page_169));
            items.add(new MyItems(R.mipmap.page_170));
            items.add(new MyItems(R.mipmap.page_171));
            items.add(new MyItems(R.mipmap.page_172));
            items.add(new MyItems(R.mipmap.page_173));
            items.add(new MyItems(R.mipmap.page_174));
            items.add(new MyItems(R.mipmap.page_175));
            items.add(new MyItems(R.mipmap.page_176));
            items.add(new MyItems(R.mipmap.page_177));
            items.add(new MyItems(R.mipmap.page_178));
            items.add(new MyItems(R.mipmap.page_179));
            items.add(new MyItems(R.mipmap.page_180));
            items.add(new MyItems(R.mipmap.page_181));
            items.add(new MyItems(R.mipmap.page_182));
            items.add(new MyItems(R.mipmap.page_183));
            items.add(new MyItems(R.mipmap.page_184));
            items.add(new MyItems(R.mipmap.page_185));
            items.add(new MyItems(R.mipmap.page_186));
            items.add(new MyItems(R.mipmap.page_187));
            items.add(new MyItems(R.mipmap.page_188));
            items.add(new MyItems(R.mipmap.page_189));
            items.add(new MyItems(R.mipmap.page_190));
            items.add(new MyItems(R.mipmap.page_191));
            items.add(new MyItems(R.mipmap.page_192));
            items.add(new MyItems(R.mipmap.page_193));
            items.add(new MyItems(R.mipmap.page_194));
            items.add(new MyItems(R.mipmap.page_195));
            items.add(new MyItems(R.mipmap.page_196));
            items.add(new MyItems(R.mipmap.page_197));
            items.add(new MyItems(R.mipmap.page_198));
            items.add(new MyItems(R.mipmap.page_199));
            items.add(new MyItems(R.mipmap.page_200));
            items.add(new MyItems(R.mipmap.page_201));
            items.add(new MyItems(R.mipmap.page_202));
            items.add(new MyItems(R.mipmap.page_203));
            items.add(new MyItems(R.mipmap.page_204));
            items.add(new MyItems(R.mipmap.page_205));
            items.add(new MyItems(R.mipmap.page_206));
            items.add(new MyItems(R.mipmap.page_207));
            items.add(new MyItems(R.mipmap.page_208));
            items.add(new MyItems(R.mipmap.page_209));
            items.add(new MyItems(R.mipmap.page_210));
            items.add(new MyItems(R.mipmap.page_211));
            items.add(new MyItems(R.mipmap.page_212));
            items.add(new MyItems(R.mipmap.page_213));
            items.add(new MyItems(R.mipmap.page_214));
            items.add(new MyItems(R.mipmap.page_215));
            items.add(new MyItems(R.mipmap.page_216));
            items.add(new MyItems(R.mipmap.page_217));
            items.add(new MyItems(R.mipmap.page_218));
            items.add(new MyItems(R.mipmap.page_219));
            items.add(new MyItems(R.mipmap.page_220));
            items.add(new MyItems(R.mipmap.page_221));
            items.add(new MyItems(R.mipmap.page_222));
            items.add(new MyItems(R.mipmap.page_223));
            items.add(new MyItems(R.mipmap.page_224));
            items.add(new MyItems(R.mipmap.page_225));
            items.add(new MyItems(R.mipmap.page_226));
            items.add(new MyItems(R.mipmap.page_227));
            items.add(new MyItems(R.mipmap.page_228));
            items.add(new MyItems(R.mipmap.page_229));
            items.add(new MyItems(R.mipmap.page_230));
            items.add(new MyItems(R.mipmap.page_231));
            items.add(new MyItems(R.mipmap.page_232));
            items.add(new MyItems(R.mipmap.page_233));
            items.add(new MyItems(R.mipmap.page_234));
            items.add(new MyItems(R.mipmap.page_235));
            items.add(new MyItems(R.mipmap.page_236));
            items.add(new MyItems(R.mipmap.page_237));
            items.add(new MyItems(R.mipmap.page_238));
            items.add(new MyItems(R.mipmap.page_239));
            items.add(new MyItems(R.mipmap.page_240));
            items.add(new MyItems(R.mipmap.page_241));
            items.add(new MyItems(R.mipmap.page_242));
            items.add(new MyItems(R.mipmap.page_243));
            items.add(new MyItems(R.mipmap.page_244));
            items.add(new MyItems(R.mipmap.page_245));
            items.add(new MyItems(R.mipmap.page_246));
            items.add(new MyItems(R.mipmap.page_247));
            items.add(new MyItems(R.mipmap.page_248));
            items.add(new MyItems(R.mipmap.page_249));
            items.add(new MyItems(R.mipmap.page_250));
            items.add(new MyItems(R.mipmap.page_251));
            items.add(new MyItems(R.mipmap.page_252));
            items.add(new MyItems(R.mipmap.page_253));
            items.add(new MyItems(R.mipmap.page_254));
            items.add(new MyItems(R.mipmap.page_255));
            items.add(new MyItems(R.mipmap.page_256));
            items.add(new MyItems(R.mipmap.page_257));
            items.add(new MyItems(R.mipmap.page_258));
            items.add(new MyItems(R.mipmap.page_259));
            items.add(new MyItems(R.mipmap.page_260));
            items.add(new MyItems(R.mipmap.page_261));
            items.add(new MyItems(R.mipmap.page_262));
            items.add(new MyItems(R.mipmap.page_263));
            items.add(new MyItems(R.mipmap.page_264));
            items.add(new MyItems(R.mipmap.page_265));
            items.add(new MyItems(R.mipmap.page_266));
            items.add(new MyItems(R.mipmap.page_267));
            items.add(new MyItems(R.mipmap.page_268));
            items.add(new MyItems(R.mipmap.page_269));
            items.add(new MyItems(R.mipmap.page_270));
            items.add(new MyItems(R.mipmap.page_271));
            items.add(new MyItems(R.mipmap.page_272));
            items.add(new MyItems(R.mipmap.page_273));
            items.add(new MyItems(R.mipmap.page_274));
            items.add(new MyItems(R.mipmap.page_275));
            items.add(new MyItems(R.mipmap.page_276));
            items.add(new MyItems(R.mipmap.page_277));
            items.add(new MyItems(R.mipmap.page_278));
            items.add(new MyItems(R.mipmap.page_279));
            items.add(new MyItems(R.mipmap.page_280));
            items.add(new MyItems(R.mipmap.page_281));
            items.add(new MyItems(R.mipmap.page_282));
            items.add(new MyItems(R.mipmap.page_283));
            items.add(new MyItems(R.mipmap.page_284));
            items.add(new MyItems(R.mipmap.page_285));
            items.add(new MyItems(R.mipmap.page_286));
            items.add(new MyItems(R.mipmap.page_287));
            items.add(new MyItems(R.mipmap.page_288));
            items.add(new MyItems(R.mipmap.page_289));
            items.add(new MyItems(R.mipmap.page_290));
            items.add(new MyItems(R.mipmap.page_291));
            items.add(new MyItems(R.mipmap.page_292));
            items.add(new MyItems(R.mipmap.page_293));
            items.add(new MyItems(R.mipmap.page_294));
            items.add(new MyItems(R.mipmap.page_295));
            items.add(new MyItems(R.mipmap.page_296));
            items.add(new MyItems(R.mipmap.page_297));
            items.add(new MyItems(R.mipmap.page_298));
            items.add(new MyItems(R.mipmap.page_299));
            items.add(new MyItems(R.mipmap.page_300));
            items.add(new MyItems(R.mipmap.page_301));
            items.add(new MyItems(R.mipmap.page_302));
            items.add(new MyItems(R.mipmap.page_303));
            items.add(new MyItems(R.mipmap.page_304));
            items.add(new MyItems(R.mipmap.page_305));
            items.add(new MyItems(R.mipmap.page_306));
            items.add(new MyItems(R.mipmap.page_307));
            items.add(new MyItems(R.mipmap.page_308));
            items.add(new MyItems(R.mipmap.page_309));
            items.add(new MyItems(R.mipmap.page_310));
            items.add(new MyItems(R.mipmap.page_311));
            items.add(new MyItems(R.mipmap.page_312));
            items.add(new MyItems(R.mipmap.page_313));
            items.add(new MyItems(R.mipmap.page_314));
            items.add(new MyItems(R.mipmap.page_315));
            items.add(new MyItems(R.mipmap.page_316));
            items.add(new MyItems(R.mipmap.page_317));
            items.add(new MyItems(R.mipmap.page_318));
            items.add(new MyItems(R.mipmap.page_319));
            items.add(new MyItems(R.mipmap.page_320));
            items.add(new MyItems(R.mipmap.page_321));
            items.add(new MyItems(R.mipmap.page_322));
            items.add(new MyItems(R.mipmap.page_323));
            items.add(new MyItems(R.mipmap.page_324));
            items.add(new MyItems(R.mipmap.page_325));
            items.add(new MyItems(R.mipmap.page_326));
            items.add(new MyItems(R.mipmap.page_327));
            items.add(new MyItems(R.mipmap.page_328));
            items.add(new MyItems(R.mipmap.page_329));
            items.add(new MyItems(R.mipmap.page_320));
            items.add(new MyItems(R.mipmap.page_331));
            items.add(new MyItems(R.mipmap.page_332));
            items.add(new MyItems(R.mipmap.page_333));
            items.add(new MyItems(R.mipmap.page_334));
            items.add(new MyItems(R.mipmap.page_335));
            items.add(new MyItems(R.mipmap.page_336));
            items.add(new MyItems(R.mipmap.page_337));
            items.add(new MyItems(R.mipmap.page_338));
            items.add(new MyItems(R.mipmap.page_339));
            items.add(new MyItems(R.mipmap.page_340));
            items.add(new MyItems(R.mipmap.page_341));
            items.add(new MyItems(R.mipmap.page_342));
            items.add(new MyItems(R.mipmap.page_343));
            items.add(new MyItems(R.mipmap.page_344));
            items.add(new MyItems(R.mipmap.page_345));
            items.add(new MyItems(R.mipmap.page_346));
            items.add(new MyItems(R.mipmap.page_347));
            items.add(new MyItems(R.mipmap.page_348));
            items.add(new MyItems(R.mipmap.page_349));
            items.add(new MyItems(R.mipmap.page_350));
            items.add(new MyItems(R.mipmap.page_351));
            items.add(new MyItems(R.mipmap.page_352));
            items.add(new MyItems(R.mipmap.page_353));
            items.add(new MyItems(R.mipmap.page_354));
            items.add(new MyItems(R.mipmap.page_355));
            items.add(new MyItems(R.mipmap.page_356));
            items.add(new MyItems(R.mipmap.page_357));
            items.add(new MyItems(R.mipmap.page_358));
            items.add(new MyItems(R.mipmap.page_359));
            items.add(new MyItems(R.mipmap.page_360));
            items.add(new MyItems(R.mipmap.page_361));
            items.add(new MyItems(R.mipmap.page_362));
            items.add(new MyItems(R.mipmap.page_363));
            items.add(new MyItems(R.mipmap.page_364));
            items.add(new MyItems(R.mipmap.page_365));
            items.add(new MyItems(R.mipmap.page_366));
            items.add(new MyItems(R.mipmap.page_367));
            items.add(new MyItems(R.mipmap.page_368));
            items.add(new MyItems(R.mipmap.page_369));
            items.add(new MyItems(R.mipmap.page_370));
            items.add(new MyItems(R.mipmap.page_371));
            items.add(new MyItems(R.mipmap.page_372));
            items.add(new MyItems(R.mipmap.page_373));
            items.add(new MyItems(R.mipmap.page_374));
            items.add(new MyItems(R.mipmap.page_375));
            items.add(new MyItems(R.mipmap.page_376));
            items.add(new MyItems(R.mipmap.page_377));
            items.add(new MyItems(R.mipmap.page_378));
            items.add(new MyItems(R.mipmap.page_379));
            items.add(new MyItems(R.mipmap.page_380));
            items.add(new MyItems(R.mipmap.page_381));
            items.add(new MyItems(R.mipmap.page_382));
            items.add(new MyItems(R.mipmap.page_383));
            items.add(new MyItems(R.mipmap.page_384));
            items.add(new MyItems(R.mipmap.page_385));
            items.add(new MyItems(R.mipmap.page_386));
            items.add(new MyItems(R.mipmap.page_387));
            items.add(new MyItems(R.mipmap.page_388));
            items.add(new MyItems(R.mipmap.page_389));
            items.add(new MyItems(R.mipmap.page_390));
            items.add(new MyItems(R.mipmap.page_391));
            items.add(new MyItems(R.mipmap.page_392));
            items.add(new MyItems(R.mipmap.page_393));
            items.add(new MyItems(R.mipmap.page_394));
            items.add(new MyItems(R.mipmap.page_395));
            items.add(new MyItems(R.mipmap.page_396));
            items.add(new MyItems(R.mipmap.page_397));
            items.add(new MyItems(R.mipmap.page_398));
            items.add(new MyItems(R.mipmap.page_399));
            items.add(new MyItems(R.mipmap.page_400));
            items.add(new MyItems(R.mipmap.page_401));
            items.add(new MyItems(R.mipmap.page_402));
            items.add(new MyItems(R.mipmap.page_403));
            items.add(new MyItems(R.mipmap.page_404));
            items.add(new MyItems(R.mipmap.page_405));
            items.add(new MyItems(R.mipmap.page_406));
            items.add(new MyItems(R.mipmap.page_407));
            items.add(new MyItems(R.mipmap.page_408));
            items.add(new MyItems(R.mipmap.page_409));
            items.add(new MyItems(R.mipmap.page_410));
            items.add(new MyItems(R.mipmap.page_411));
            items.add(new MyItems(R.mipmap.page_412));
            items.add(new MyItems(R.mipmap.page_413));
            items.add(new MyItems(R.mipmap.page_414));
            items.add(new MyItems(R.mipmap.page_415));
            items.add(new MyItems(R.mipmap.page_416));
            items.add(new MyItems(R.mipmap.page_417));
            items.add(new MyItems(R.mipmap.page_418));
            items.add(new MyItems(R.mipmap.page_419));
            items.add(new MyItems(R.mipmap.page_420));
            items.add(new MyItems(R.mipmap.page_421));
            items.add(new MyItems(R.mipmap.page_422));
            items.add(new MyItems(R.mipmap.page_423));
            items.add(new MyItems(R.mipmap.page_424));
            items.add(new MyItems(R.mipmap.page_425));
            items.add(new MyItems(R.mipmap.page_426));
            items.add(new MyItems(R.mipmap.page_427));
            items.add(new MyItems(R.mipmap.page_428));
            items.add(new MyItems(R.mipmap.page_429));
            items.add(new MyItems(R.mipmap.page_420));
            items.add(new MyItems(R.mipmap.page_431));
            items.add(new MyItems(R.mipmap.page_432));
            items.add(new MyItems(R.mipmap.page_433));
            items.add(new MyItems(R.mipmap.page_434));
            items.add(new MyItems(R.mipmap.page_435));
            items.add(new MyItems(R.mipmap.page_436));
            items.add(new MyItems(R.mipmap.page_437));
            items.add(new MyItems(R.mipmap.page_438));
            items.add(new MyItems(R.mipmap.page_439));
            items.add(new MyItems(R.mipmap.page_440));
            items.add(new MyItems(R.mipmap.page_441));
            items.add(new MyItems(R.mipmap.page_442));
            items.add(new MyItems(R.mipmap.page_443));
            items.add(new MyItems(R.mipmap.page_444));
            items.add(new MyItems(R.mipmap.page_445));
            items.add(new MyItems(R.mipmap.page_446));
            items.add(new MyItems(R.mipmap.page_447));
            items.add(new MyItems(R.mipmap.page_448));
            items.add(new MyItems(R.mipmap.page_449));
            items.add(new MyItems(R.mipmap.page_450));
            items.add(new MyItems(R.mipmap.page_451));
            items.add(new MyItems(R.mipmap.page_452));
            items.add(new MyItems(R.mipmap.page_453));
            items.add(new MyItems(R.mipmap.page_454));
            items.add(new MyItems(R.mipmap.page_455));
            items.add(new MyItems(R.mipmap.page_456));
            items.add(new MyItems(R.mipmap.page_457));
            items.add(new MyItems(R.mipmap.page_458));
            items.add(new MyItems(R.mipmap.page_459));
            items.add(new MyItems(R.mipmap.page_460));
            items.add(new MyItems(R.mipmap.page_461));
            items.add(new MyItems(R.mipmap.page_462));
            items.add(new MyItems(R.mipmap.page_463));
            items.add(new MyItems(R.mipmap.page_464));
            items.add(new MyItems(R.mipmap.page_465));
            items.add(new MyItems(R.mipmap.page_466));
            items.add(new MyItems(R.mipmap.page_467));
            items.add(new MyItems(R.mipmap.page_468));
            items.add(new MyItems(R.mipmap.page_469));
            items.add(new MyItems(R.mipmap.page_470));
            items.add(new MyItems(R.mipmap.page_471));
            items.add(new MyItems(R.mipmap.page_472));
            items.add(new MyItems(R.mipmap.page_473));
            items.add(new MyItems(R.mipmap.page_474));
            items.add(new MyItems(R.mipmap.page_475));
            items.add(new MyItems(R.mipmap.page_476));
            items.add(new MyItems(R.mipmap.page_477));
            items.add(new MyItems(R.mipmap.page_478));
            items.add(new MyItems(R.mipmap.page_479));
            items.add(new MyItems(R.mipmap.page_480));
            items.add(new MyItems(R.mipmap.page_481));
            items.add(new MyItems(R.mipmap.page_482));
            items.add(new MyItems(R.mipmap.page_483));
            items.add(new MyItems(R.mipmap.page_484));
            items.add(new MyItems(R.mipmap.page_485));
            items.add(new MyItems(R.mipmap.page_486));
            items.add(new MyItems(R.mipmap.page_487));
            items.add(new MyItems(R.mipmap.page_488));
            items.add(new MyItems(R.mipmap.page_489));
            items.add(new MyItems(R.mipmap.page_490));
            items.add(new MyItems(R.mipmap.page_491));
            items.add(new MyItems(R.mipmap.page_492));
            items.add(new MyItems(R.mipmap.page_493));
            items.add(new MyItems(R.mipmap.page_494));
            items.add(new MyItems(R.mipmap.page_495));
            items.add(new MyItems(R.mipmap.page_496));
            items.add(new MyItems(R.mipmap.page_497));
            items.add(new MyItems(R.mipmap.page_498));
            items.add(new MyItems(R.mipmap.page_499));
            items.add(new MyItems(R.mipmap.page_500));
            items.add(new MyItems(R.mipmap.page_501));
            items.add(new MyItems(R.mipmap.page_502));
            items.add(new MyItems(R.mipmap.page_503));
            items.add(new MyItems(R.mipmap.page_504));
            items.add(new MyItems(R.mipmap.page_505));
            items.add(new MyItems(R.mipmap.page_506));
            items.add(new MyItems(R.mipmap.page_507));
            items.add(new MyItems(R.mipmap.page_508));
            items.add(new MyItems(R.mipmap.page_509));
            items.add(new MyItems(R.mipmap.page_510));
            items.add(new MyItems(R.mipmap.page_511));
            items.add(new MyItems(R.mipmap.page_512));
            items.add(new MyItems(R.mipmap.page_513));
            items.add(new MyItems(R.mipmap.page_514));
            items.add(new MyItems(R.mipmap.page_515));
            items.add(new MyItems(R.mipmap.page_516));
            items.add(new MyItems(R.mipmap.page_517));
            items.add(new MyItems(R.mipmap.page_518));
            items.add(new MyItems(R.mipmap.page_519));
            items.add(new MyItems(R.mipmap.page_520));
            items.add(new MyItems(R.mipmap.page_521));
            items.add(new MyItems(R.mipmap.page_522));
            items.add(new MyItems(R.mipmap.page_523));
            items.add(new MyItems(R.mipmap.page_524));
            items.add(new MyItems(R.mipmap.page_525));
            items.add(new MyItems(R.mipmap.page_526));
            items.add(new MyItems(R.mipmap.page_527));
            items.add(new MyItems(R.mipmap.page_528));
            items.add(new MyItems(R.mipmap.page_529));
            items.add(new MyItems(R.mipmap.page_520));
            items.add(new MyItems(R.mipmap.page_531));
            items.add(new MyItems(R.mipmap.page_532));
            items.add(new MyItems(R.mipmap.page_533));
            items.add(new MyItems(R.mipmap.page_534));
            items.add(new MyItems(R.mipmap.page_535));
            items.add(new MyItems(R.mipmap.page_536));
            items.add(new MyItems(R.mipmap.page_537));
            items.add(new MyItems(R.mipmap.page_538));
            items.add(new MyItems(R.mipmap.page_539));
            items.add(new MyItems(R.mipmap.page_540));
            items.add(new MyItems(R.mipmap.page_541));
            items.add(new MyItems(R.mipmap.page_542));
            items.add(new MyItems(R.mipmap.page_543));
            items.add(new MyItems(R.mipmap.page_544));
            items.add(new MyItems(R.mipmap.page_545));
            items.add(new MyItems(R.mipmap.page_546));
            items.add(new MyItems(R.mipmap.page_547));
            items.add(new MyItems(R.mipmap.page_548));
            items.add(new MyItems(R.mipmap.page_549));
            items.add(new MyItems(R.mipmap.page_550));
            items.add(new MyItems(R.mipmap.page_551));
            items.add(new MyItems(R.mipmap.page_552));
            items.add(new MyItems(R.mipmap.page_553));
            items.add(new MyItems(R.mipmap.page_554));
            items.add(new MyItems(R.mipmap.page_555));
            items.add(new MyItems(R.mipmap.page_556));
            items.add(new MyItems(R.mipmap.page_557));
            items.add(new MyItems(R.mipmap.page_558));
            items.add(new MyItems(R.mipmap.page_559));
            items.add(new MyItems(R.mipmap.page_560));
            items.add(new MyItems(R.mipmap.page_561));
            items.add(new MyItems(R.mipmap.page_562));
            items.add(new MyItems(R.mipmap.page_563));
            items.add(new MyItems(R.mipmap.page_564));
            items.add(new MyItems(R.mipmap.page_565));
            items.add(new MyItems(R.mipmap.page_566));
            items.add(new MyItems(R.mipmap.page_567));
            items.add(new MyItems(R.mipmap.page_568));
            items.add(new MyItems(R.mipmap.page_569));
            items.add(new MyItems(R.mipmap.page_570));
            items.add(new MyItems(R.mipmap.page_571));
            items.add(new MyItems(R.mipmap.page_572));
            items.add(new MyItems(R.mipmap.page_573));
            items.add(new MyItems(R.mipmap.page_574));
            items.add(new MyItems(R.mipmap.page_575));
            items.add(new MyItems(R.mipmap.page_576));
            items.add(new MyItems(R.mipmap.page_577));
            items.add(new MyItems(R.mipmap.page_578));
            items.add(new MyItems(R.mipmap.page_579));
            items.add(new MyItems(R.mipmap.page_580));
            items.add(new MyItems(R.mipmap.page_581));
            items.add(new MyItems(R.mipmap.page_582));
            items.add(new MyItems(R.mipmap.page_583));
            items.add(new MyItems(R.mipmap.page_584));
            items.add(new MyItems(R.mipmap.page_585));
            items.add(new MyItems(R.mipmap.page_586));
            items.add(new MyItems(R.mipmap.page_587));
            items.add(new MyItems(R.mipmap.page_588));
            items.add(new MyItems(R.mipmap.page_589));
            items.add(new MyItems(R.mipmap.page_590));
            items.add(new MyItems(R.mipmap.page_591));
            items.add(new MyItems(R.mipmap.page_592));
            items.add(new MyItems(R.mipmap.page_593));
            items.add(new MyItems(R.mipmap.page_594));
            items.add(new MyItems(R.mipmap.page_595));
            items.add(new MyItems(R.mipmap.page_596));
            items.add(new MyItems(R.mipmap.page_597));
            items.add(new MyItems(R.mipmap.page_598));
            items.add(new MyItems(R.mipmap.page_599));
            items.add(new MyItems(R.mipmap.page_600));
            items.add(new MyItems(R.mipmap.page_601));
            items.add(new MyItems(R.mipmap.page_602));
            items.add(new MyItems(R.mipmap.page_603));
            items.add(new MyItems(R.mipmap.page_604));
            items.add(new MyItems(R.mipmap.page_605));
            items.add(new MyItems(R.mipmap.page_606));
            items.add(new MyItems(R.mipmap.page_607));
            items.add(new MyItems(R.mipmap.page_608));
            items.add(new MyItems(R.mipmap.page_609));
            items.add(new MyItems(R.mipmap.page_610));
            items.add(new MyItems(R.mipmap.page_611));
            items.add(new MyItems(R.mipmap.page_612));
            items.add(new MyItems(R.mipmap.page_613));
            items.add(new MyItems(R.mipmap.page_614));
            items.add(new MyItems(R.mipmap.page_615));
            items.add(new MyItems(R.mipmap.page_616));
            items.add(new MyItems(R.mipmap.page_617));
            items.add(new MyItems(R.mipmap.page_618));
            items.add(new MyItems(R.mipmap.page_619));
            items.add(new MyItems(R.mipmap.page_620));
            items.add(new MyItems(R.mipmap.page_621));
            items.add(new MyItems(R.mipmap.page_622));
            items.add(new MyItems(R.mipmap.page_623));
            items.add(new MyItems(R.mipmap.page_624));
            items.add(new MyItems(R.mipmap.page_625));
        }

        edtPageNumber.setText("0");
        adapter = new ItemsArrayAdapter(this, R.layout.row, R.id.imgPage, items);
        listPages.setAdapter(adapter);
        listPages.setSelection(in.getIntExtra("PAGE", 0));
        listPages.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                if (view.getFirstVisiblePosition() < 0 + 2)
                    txtPageNum.setText("" + 0);
                else
                    txtPageNum.setText("" + (view.getFirstVisiblePosition() - 2));


                //Section Counter
                {
                    if (view.getFirstVisiblePosition() >= 3 && view.getFirstVisiblePosition() < 24)
                        txtSection.setText("الاول");
                    else if (view.getFirstVisiblePosition() >= 24 && view.getFirstVisiblePosition() < 44)
                        txtSection.setText("الثاني");
                    else if (view.getFirstVisiblePosition() >= 44 && view.getFirstVisiblePosition() < 64)
                        txtSection.setText("الثالث");
                    else if (view.getFirstVisiblePosition() >= 64 && view.getFirstVisiblePosition() < 84)
                        txtSection.setText("الرابع");
                    else if (view.getFirstVisiblePosition() >= 84 && view.getFirstVisiblePosition() < 104)
                        txtSection.setText("الخامس");
                    else if (view.getFirstVisiblePosition() >= 104 && view.getFirstVisiblePosition() < 124)
                        txtSection.setText("السادس");
                    else if (view.getFirstVisiblePosition() >= 124 && view.getFirstVisiblePosition() < 144)
                        txtSection.setText("السابع");
                    else if (view.getFirstVisiblePosition() >= 144 && view.getFirstVisiblePosition() < 164)
                        txtSection.setText("الثامن");
                    else if (view.getFirstVisiblePosition() >= 164 && view.getFirstVisiblePosition() < 184)
                        txtSection.setText("التاسع");
                    else if (view.getFirstVisiblePosition() >= 184 && view.getFirstVisiblePosition() < 204)
                        txtSection.setText("العاشر");
                    else if (view.getFirstVisiblePosition() >= 204 && view.getFirstVisiblePosition() < 224)
                        txtSection.setText("الحادي عشر");
                    else if (view.getFirstVisiblePosition() >= 224 && view.getFirstVisiblePosition() < 244)
                        txtSection.setText("الثاني عشر");
                    else if (view.getFirstVisiblePosition() >= 244 && view.getFirstVisiblePosition() < 264)
                        txtSection.setText("الثالث عشر");
                    else if (view.getFirstVisiblePosition() >= 264 && view.getFirstVisiblePosition() < 284)
                        txtSection.setText("الرابع عشر");
                    else if (view.getFirstVisiblePosition() >= 284 && view.getFirstVisiblePosition() < 304)
                        txtSection.setText("الخامس عشر");
                    else if (view.getFirstVisiblePosition() >= 304 && view.getFirstVisiblePosition() < 324)
                        txtSection.setText("السادس عشر");
                    else if (view.getFirstVisiblePosition() >= 324 && view.getFirstVisiblePosition() < 344)
                        txtSection.setText("السابع العشر");
                    else if (view.getFirstVisiblePosition() >= 344 && view.getFirstVisiblePosition() < 364)
                        txtSection.setText("الثامن عشر");
                    else if (view.getFirstVisiblePosition() >= 364 && view.getFirstVisiblePosition() < 384)
                        txtSection.setText("التاسع عشر");
                    else if (view.getFirstVisiblePosition() >= 384 && view.getFirstVisiblePosition() < 404)
                        txtSection.setText("العشرون");
                    else if (view.getFirstVisiblePosition() >= 404 && view.getFirstVisiblePosition() < 424)
                        txtSection.setText("الحادي والعشرون");
                    else if (view.getFirstVisiblePosition() >= 424 && view.getFirstVisiblePosition() < 444)
                        txtSection.setText("الثاني والعشون");
                    else if (view.getFirstVisiblePosition() >= 444 && view.getFirstVisiblePosition() < 464)
                        txtSection.setText("الثالث و العشرون");
                    else if (view.getFirstVisiblePosition() >= 464 && view.getFirstVisiblePosition() < 484)
                        txtSection.setText("الرابع والعشرون");
                    else if (view.getFirstVisiblePosition() >= 484 && view.getFirstVisiblePosition() < 504)
                        txtSection.setText("الخامس والعشرون");
                    else if (view.getFirstVisiblePosition() >= 504 && view.getFirstVisiblePosition() < 524)
                        txtSection.setText("السادس والعشرون");
                    else if (view.getFirstVisiblePosition() >= 524 && view.getFirstVisiblePosition() < 544)
                        txtSection.setText("السابع والعشرون");
                    else if (view.getFirstVisiblePosition() >= 544 && view.getFirstVisiblePosition() < 564)
                        txtSection.setText("الثامن والعشرون");
                    else if (view.getFirstVisiblePosition() >= 564 && view.getFirstVisiblePosition() < 584)
                        txtSection.setText("التاسع والعشرون");
                    else if (view.getFirstVisiblePosition() >= 584 && view.getFirstVisiblePosition() < 606)
                        txtSection.setText("الثلاثون");
                }


                //Surat Name
                {
                    if (view.getFirstVisiblePosition() >= 3 && view.getFirstVisiblePosition() < 4)
                        setTitle("الفَاتِحَة");
                    else if (view.getFirstVisiblePosition() >= 4 && view.getFirstVisiblePosition() < 49 + 3)
                        setTitle("البَقَرَة");
                    else if (view.getFirstVisiblePosition() >= 49 + 3 && view.getFirstVisiblePosition() < 76 + 3)
                        setTitle("آل عِمرَان");
                    else if (view.getFirstVisiblePosition() >= 76 + 3 && view.getFirstVisiblePosition() < 105 + 3)
                        setTitle("النِّسَاء");
                    else if (view.getFirstVisiblePosition() >= 105 + 3 && view.getFirstVisiblePosition() < 127 + 3)
                        setTitle("المَائدة");
                    else if (view.getFirstVisiblePosition() >= 127 + 3 && view.getFirstVisiblePosition() < 150 + 3)
                        setTitle("الأنعَام");
                    else if (view.getFirstVisiblePosition() >= 150 + 3 && view.getFirstVisiblePosition() < 176 + 3)
                        setTitle("الأعرَاف");
                    else if (view.getFirstVisiblePosition() >= 176 + 3 && view.getFirstVisiblePosition() < 186 + 3)
                        setTitle("الأنفَال");
                    else if (view.getFirstVisiblePosition() >= 186 + 3 && view.getFirstVisiblePosition() < 207 + 3)
                        setTitle("التوبَة");
                    else if (view.getFirstVisiblePosition() >= 207 + 3 && view.getFirstVisiblePosition() < 220 + 3)
                        setTitle("يُونس");
                    else if (view.getFirstVisiblePosition() >= 220 + 3 && view.getFirstVisiblePosition() < 234 + 3)
                        setTitle("هُود");
                    else if (view.getFirstVisiblePosition() >= 234 + 3 && view.getFirstVisiblePosition() < 248 + 3)
                        setTitle("يُوسُف");
                    else if (view.getFirstVisiblePosition() >= 248 + 3 && view.getFirstVisiblePosition() < 254 + 3)
                        setTitle("الرَّعْد");
                    else if (view.getFirstVisiblePosition() >= 254 + 3 && view.getFirstVisiblePosition() < 261 + 3)
                        setTitle("إبراهِيم");
                    else if (view.getFirstVisiblePosition() >= 261 + 3 && view.getFirstVisiblePosition() < 266 + 3)
                        setTitle("الحِجْر");
                    else if (view.getFirstVisiblePosition() >= 266 + 3 && view.getFirstVisiblePosition() < 281 + 3)
                        setTitle("النَّحْل");
                    else if (view.getFirstVisiblePosition() >= 281 + 3 && view.getFirstVisiblePosition() < 292 + 3)
                        setTitle("الإسْرَاء");
                    else if (view.getFirstVisiblePosition() >= 292 + 3 && view.getFirstVisiblePosition() < 304 + 3)
                        setTitle("الكهْف");
                    else if (view.getFirstVisiblePosition() >= 304 + 3 && view.getFirstVisiblePosition() < 311 + 3)
                        setTitle("مَريَم");
                    else if (view.getFirstVisiblePosition() >= 311 + 3 && view.getFirstVisiblePosition() < 321 + 3)
                        setTitle("طه");
                    else if (view.getFirstVisiblePosition() >= 321 + 3 && view.getFirstVisiblePosition() < 331 + 3)
                        setTitle("الأنبيَاء");
                    else if (view.getFirstVisiblePosition() >= 331 + 3 && view.getFirstVisiblePosition() < 341 + 3)
                        setTitle("الحَج");
                    else if (view.getFirstVisiblePosition() >= 341 + 3 && view.getFirstVisiblePosition() < 349 + 3)
                        setTitle("المُؤمنون");
                    else if (view.getFirstVisiblePosition() >= 349 + 3 && view.getFirstVisiblePosition() < 358 + 3)
                        setTitle("النُّور");
                    else if (view.getFirstVisiblePosition() >= 358 + 3 && view.getFirstVisiblePosition() < 366 + 3)
                        setTitle("الفُرْقان");
                    else if (view.getFirstVisiblePosition() >= 366 + 3 && view.getFirstVisiblePosition() < 376 + 3)
                        setTitle("الشُّعَرَاء");
                    else if (view.getFirstVisiblePosition() >= 376 + 3 && view.getFirstVisiblePosition() < 384 + 3)
                        setTitle("النَّمْل");
                    else if (view.getFirstVisiblePosition() >= 384 + 3 && view.getFirstVisiblePosition() < 396 + 2)
                        setTitle("القَصَص");
                    else if (view.getFirstVisiblePosition() >= 396 + 2 && view.getFirstVisiblePosition() < 404 + 2)
                        setTitle("العَنكبوت");
                    else if (view.getFirstVisiblePosition() >= 404 + 2 && view.getFirstVisiblePosition() < 410 + 3)
                        setTitle("الرُّوم");
                    else if (view.getFirstVisiblePosition() >= 410 + 3 && view.getFirstVisiblePosition() < 414 + 3)
                        setTitle("لقمَان");
                    else if (view.getFirstVisiblePosition() >= 414 + 3 && view.getFirstVisiblePosition() < 417 + 3)
                        setTitle("السَّجدَة");
                    else if (view.getFirstVisiblePosition() >= 417 + 3 && view.getFirstVisiblePosition() < 427 + 3)
                        setTitle("الأحزَاب");
                    else if (view.getFirstVisiblePosition() >= 427 + 3 && view.getFirstVisiblePosition() < 434 + 2)
                        setTitle("سَبَأ");
                    else if (view.getFirstVisiblePosition() >= 434 + 2 && view.getFirstVisiblePosition() < 440 + 2)
                        setTitle("فَاطِر");
                    else if (view.getFirstVisiblePosition() >= 440 + 2 && view.getFirstVisiblePosition() < 445 + 3)
                        setTitle("يس");
                    else if (view.getFirstVisiblePosition() >= 445 + 3 && view.getFirstVisiblePosition() < 452 + 3)
                        setTitle("الصَّافات");
                    else if (view.getFirstVisiblePosition() >= 452 + 3 && view.getFirstVisiblePosition() < 458 + 2)
                        setTitle("ص");
                    else if (view.getFirstVisiblePosition() >= 458 + 2 && view.getFirstVisiblePosition() < 467 + 2)
                        setTitle("الزُّمَر");
                    else if (view.getFirstVisiblePosition() >= 467 + 2 && view.getFirstVisiblePosition() < 476 + 2)
                        setTitle("غَافِر");
                    else if (view.getFirstVisiblePosition() >= 476 + 3 && view.getFirstVisiblePosition() < 482 + 3)
                        setTitle("فُصِّلَتْ");
                    else if (view.getFirstVisiblePosition() >= 482 + 3 && view.getFirstVisiblePosition() < 489 + 2)
                        setTitle("الشُّورَى");
                    else if (view.getFirstVisiblePosition() >= 489 + 2 && view.getFirstVisiblePosition() < 495 + 3)
                        setTitle("الزُّخْرُف");
                    else if (view.getFirstVisiblePosition() >= 495 + 3 && view.getFirstVisiblePosition() < 498 + 3)
                        setTitle("الدُّخان");
                    else if (view.getFirstVisiblePosition() >= 498 + 3 && view.getFirstVisiblePosition() < 502 + 3)
                        setTitle("الجاثِية");
                    else if (view.getFirstVisiblePosition() >= 502 + 2 && view.getFirstVisiblePosition() < 506 + 3)
                        setTitle("الأحقاف");
                    else if (view.getFirstVisiblePosition() >= 506 + 3 && view.getFirstVisiblePosition() < 510 + 3)
                        setTitle("مُحَمّد");
                    else if (view.getFirstVisiblePosition() >= 510 + 3 && view.getFirstVisiblePosition() < 515 + 2)
                        setTitle("الفَتْح");
                    else if (view.getFirstVisiblePosition() >= 515 + 2 && view.getFirstVisiblePosition() < 517 + 3)
                        setTitle("الحُجُرات");
                    else if (view.getFirstVisiblePosition() >= 517 + 3 && view.getFirstVisiblePosition() < 519 + 3)
                        setTitle("ق");
                    else if (view.getFirstVisiblePosition() >= 519 + 3 && view.getFirstVisiblePosition() < 522 + 3)
                        setTitle("الذَّاريَات");
                    else if (view.getFirstVisiblePosition() >= 522 + 3 && view.getFirstVisiblePosition() < 525 + 3)
                        setTitle("الطُّور");
                    else if (view.getFirstVisiblePosition() >= 525 + 3 && view.getFirstVisiblePosition() < 527 + 3)
                        setTitle("النَّجْم");
                    else if (view.getFirstVisiblePosition() >= 527 + 3 && view.getFirstVisiblePosition() < 530 + 3)
                        setTitle("القَمَر");
                    else if (view.getFirstVisiblePosition() >= 530 + 3 && view.getFirstVisiblePosition() < 533 + 3)
                        setTitle("الرَّحمن");
                    else if (view.getFirstVisiblePosition() >= 533 + 3 && view.getFirstVisiblePosition() < 536 + 3)
                        setTitle("الواقِعَة");
                    else if (view.getFirstVisiblePosition() >= 536 + 3 && view.getFirstVisiblePosition() < 541 + 3)
                        setTitle("الحَديد");
                    else if (view.getFirstVisiblePosition() >= 541 + 3 && view.getFirstVisiblePosition() < 544 + 3)
                        setTitle("المُجادَلة");
                    else if (view.getFirstVisiblePosition() >= 544 + 3 && view.getFirstVisiblePosition() < 548 + 3)
                        setTitle("الحَشْر");
                    else if (view.getFirstVisiblePosition() >= 548 + 3 && view.getFirstVisiblePosition() < 550 + 3)
                        setTitle("المُمتَحَنة");
                    else if (view.getFirstVisiblePosition() >= 550 + 3 && view.getFirstVisiblePosition() < 552 + 3)
                        setTitle("الصَّف");
                    else if (view.getFirstVisiblePosition() >= 552 + 3 && view.getFirstVisiblePosition() < 553 + 3)
                        setTitle("الجُّمُعة");
                    else if (view.getFirstVisiblePosition() >= 553 + 3 && view.getFirstVisiblePosition() < 555 + 3)
                        setTitle("المُنافِقُون");
                    else if (view.getFirstVisiblePosition() >= 555 + 3 && view.getFirstVisiblePosition() < 557 + 3)
                        setTitle("التَّغابُن");
                    else if (view.getFirstVisiblePosition() >= 557 + 3 && view.getFirstVisiblePosition() < 559 + 3)
                        setTitle("الطَّلاق");
                    else if (view.getFirstVisiblePosition() >= 559 + 3 && view.getFirstVisiblePosition() < 561 + 3)
                        setTitle("التَّحْريم");
                    else if (view.getFirstVisiblePosition() >= 561 + 3 && view.getFirstVisiblePosition() < 564 + 3)
                        setTitle("المُلْك");
                    else if (view.getFirstVisiblePosition() >= 564 + 2 && view.getFirstVisiblePosition() < 565 + 3)
                        setTitle("القَلـََم");
                    else if (view.getFirstVisiblePosition() >= 565 + 3 && view.getFirstVisiblePosition() < 567 + 3)
                        setTitle("الحَاقّـَة");
                    else if (view.getFirstVisiblePosition() >= 567 + 3 && view.getFirstVisiblePosition() < 569 + 3)
                        setTitle("المَعارِج");
                    else if (view.getFirstVisiblePosition() >= 569 + 3 && view.getFirstVisiblePosition() < 571 + 3)
                        setTitle("نُوح");
                    else if (view.getFirstVisiblePosition() >= 571 + 3 && view.getFirstVisiblePosition() < 573 + 3)
                        setTitle("الجِنّ");
                    else if (view.getFirstVisiblePosition() == 573 + 3)
                        setTitle("المُزَّمّـِل");
                    else if (view.getFirstVisiblePosition() >= 574 + 3 && view.getFirstVisiblePosition() < 576 + 3)
                        setTitle("المُدَّثــِّر");
                    else if (view.getFirstVisiblePosition() == 576 + 3)
                        setTitle("القِيامَة");
                    else if (view.getFirstVisiblePosition() >= 577 + 3 && view.getFirstVisiblePosition() < 579 + 3)
                        setTitle("الإنسان");
                    else if (view.getFirstVisiblePosition() >= 579 + 3 && view.getFirstVisiblePosition() < 581 + 3)
                        setTitle("المُرسَلات");
                    else if (view.getFirstVisiblePosition() == 581 + 3)
                        setTitle("النـَّبأ");
                    else if (view.getFirstVisiblePosition() >= 582 + 3 && view.getFirstVisiblePosition() < 584 + 3)
                        setTitle("النـّازِعات");
                    else if (view.getFirstVisiblePosition() == 584 + 3)
                        setTitle("عَبَس");
                    else if (view.getFirstVisiblePosition() == 585 + 3)
                        setTitle("التـَّكْوير");
                    else if (view.getFirstVisiblePosition() >= 586 + 3 && view.getFirstVisiblePosition() < 588 + 3)
                        setTitle(" الإنفِطار " + "- المُطـَفِّفين -");
                    else if (view.getFirstVisiblePosition() == 588 + 3)
                        setTitle("الإنشِقاق");
                    else if (view.getFirstVisiblePosition() == 589 + 3)
                        setTitle("البُروج");
                    else if (view.getFirstVisiblePosition() == 590 + 3)
                        setTitle(" الطّارق " + "- الأعلی -");
                    else if (view.getFirstVisiblePosition() == 591 + 3)
                        setTitle("الغاشِيَة");
                    else if (view.getFirstVisiblePosition() == 592 + 3)
                        setTitle("الفَجْر");
                    else if (view.getFirstVisiblePosition() == 593 + 3)
                        setTitle("البَـلـَد");
                    else if (view.getFirstVisiblePosition() == 594 + 3)
                        setTitle(" الشــَّمْس " + "- اللـَّيل -");
                    else if (view.getFirstVisiblePosition() == 595 + 3)
                        setTitle(" الضُّحی " + "- الشَّرْح -");
                    else if (view.getFirstVisiblePosition() == 596 + 3)
                        setTitle(" التـِّين " + "- العَلـَق -");
                    else if (view.getFirstVisiblePosition() == 597 + 3)
                        setTitle(" القـَدر " + "- البَيِّنَة -");
                    else if (view.getFirstVisiblePosition() == 598 + 3)
                        setTitle(" الزلزَلة" + "- العَادِيات -");
                    else if (view.getFirstVisiblePosition() == 599 + 3)
                        setTitle(" القارِعَة " + "- التَكاثـُر -");
                    else if (view.getFirstVisiblePosition() == 600 + 3)
                        setTitle(" العَصْر " + "- الهُمَزَة -" + "- الفِيل - ");
                    else if (view.getFirstVisiblePosition() == 601 + 3)
                        setTitle(" قـُرَيْش " + "- المَاعُون -" + "- الكَوْثَر - ");
                    else if (view.getFirstVisiblePosition() == 602 + 3)
                        setTitle(" الكَافِرُون " + "- النـَّصر - " + "- المَسَد - ");
                    else if (view.getFirstVisiblePosition() == 603 + 3)
                        setTitle(" الإخْلَاص " + "- الفَلَق - " + "- النَّاس - ");
                    else if (view.getFirstVisiblePosition() == 618 + 3 || view.getFirstVisiblePosition() == 619 + 3)
                        setTitle("الفهرس");
                    else
                        setTitle("المصحف");

                }
            }
        });
        btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listPages.setSelection(Integer.parseInt(edtPageNumber.getText().toString()) + 2);
            }
        });
    }

}