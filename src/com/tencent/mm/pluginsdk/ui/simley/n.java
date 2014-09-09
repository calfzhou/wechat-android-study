package com.tencent.mm.pluginsdk.ui.simley;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.bz;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMRadioGroupView;
import com.tencent.mm.ui.base.MMRadioImageButton;
import com.tencent.mm.ui.base.MMSmoothHorizontalScrollView;
import com.tencent.mm.ui.base.cz;
import com.tencent.mm.ui.base.db;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n
  implements bz, View.OnClickListener, s, az, cz, db
{
  private final String TAG = "!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==";
  private View aL;
  private Context dkf = ak.getContext();
  private Context eAJ;
  private MMDotView eER;
  private i hIA;
  private volatile boolean hJA = false;
  private volatile int hJB = -1;
  private SmileyPanelVP hJm;
  private r hJn;
  private MMSmoothHorizontalScrollView hJo;
  private MMRadioGroupView hJp;
  private MMRadioImageButton hJq;
  private List hJr;
  private ImageView hJs;
  private ImageView hJt;
  private ImageButton hJu;
  private TextView hJv;
  private q hJw;
  private ay hJx;
  private final int hJy = 5;
  private ImageView hJz;

  public n(Context paramContext, i parami, q paramq)
  {
    this.eAJ = paramContext;
    this.hIA = parami;
    this.hJw = paramq;
    this.hJx = new ay(this, false);
  }

  private void a(String paramString, MMRadioImageButton paramMMRadioImageButton)
  {
    this.hIA.a(paramString, this, paramMMRadioImageButton.isCheckable());
  }

  private MMRadioImageButton aEA()
  {
    if (this.hJq == null)
      this.hJq = v.c(this.hIA);
    return this.hJq;
  }

  private ImageView aEB()
  {
    if (this.hJs == null)
      this.hJs = v.a(this.hIA, this);
    return this.hJs;
  }

  private ImageView aEC()
  {
    if (this.hJz == null)
      this.hJz = v.b(this.hIA, this);
    return this.hJz;
  }

  private ImageButton aEE()
  {
    if (this.hJu == null)
      this.hJu = v.b(this.hIA);
    return this.hJu;
  }

  private void aEF()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("entrance_scence", 0);
    localIntent.putExtra("check_clickflag", false);
    if (i.aDG())
    {
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "called emoji store must refresh by net");
      localIntent.putExtra("emoji_stroe_must_refresh_by_net", true);
    }
    if (!ch.jb(this.hIA.aEp()))
      localIntent.putExtra("to_talker_name", this.hIA.aEp());
    com.tencent.mm.am.a.b(this.dkf, "emoji", ".ui.EmojiStoreUI", localIntent);
  }

  private void aEx()
  {
    z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "- deal View");
    g localg2;
    int i;
    if (this.hJn == null)
    {
      aEy();
      this.hJn = new r(this.hIA);
      localg2 = this.hIA.aDX();
      SmileyPanelVP localSmileyPanelVP = this.hJm;
      r localr = this.hJn;
      if (localg2 == null)
      {
        i = 0;
        localSmileyPanelVP.a(localr, i);
        this.hJm.l(1);
      }
    }
    g localg1;
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.hIA.aDN();
      z.i("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "init dot view: current  show productId: %s", arrayOfObject);
      localg1 = this.hIA.aDX();
      if (localg1 == null)
      {
        i locali = this.hIA;
        locali.vR("TAG_DEFAULT_TAB");
        localg1 = this.hIA.aDX();
      }
      if ((localg1 != null) && (localg1.aDC() != null))
      {
        localg1.aDC().setChecked(true);
        aEI();
        this.hJm.k(localg1.aDt());
        if (localg1 == null)
          break label226;
        String str = localg1.JS();
        if (str.equals("TAG_DEFAULT_TAB"))
          break label226;
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "init set currentItem not default qq. ");
      }
      return;
      i = localg2.aDt();
      break;
      this.hJn.aEM();
    }
    label226: aL(localg1.aDw(), 0);
  }

  private void aEz()
  {
    int i = this.hJo.getWidth();
    int j = this.hIA.aDL();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(j);
    z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "jacks visibilityWidth: %d, itemWidth: %d", arrayOfObject);
    if ((!this.hIA.aDV()) || (this.hJv.getVisibility() != 0))
    {
      if (this.hJr != null)
        if (this.hJt != null)
        {
          this.hJt.setOnClickListener(this);
          if (!i.aDG())
            break label145;
          this.hJt.setBackgroundResource(com.tencent.mm.h.SU);
        }
      while (j * (1 + (1 + (1 + this.hJr.size()))) >= i)
      {
        this.hJs.setVisibility(4);
        this.hJt.setVisibility(0);
        return;
        label145: this.hJt.setBackgroundResource(com.tencent.mm.h.ST);
      }
    }
    this.hJt.setVisibility(8);
    this.hJs.setVisibility(0);
  }

  private void aL(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 1)
    {
      this.eER.setVisibility(4);
      return;
    }
    this.eER.setVisibility(0);
    this.eER.pt(paramInt1);
    this.eER.pu(paramInt2);
  }

  private MMRadioImageButton d(ab paramab)
  {
    return v.a(paramab, this.hIA);
  }

  private void e(ab paramab)
  {
    if (paramab == null)
      return;
    Intent localIntent = new Intent();
    localIntent.putExtra("extra_id", paramab.field_productID);
    localIntent.putExtra("extra_name", paramab.field_packName);
    localIntent.putExtra("extra_copyright", paramab.field_packCopyright);
    localIntent.putExtra("extra_coverurl", paramab.field_packCoverUrl);
    localIntent.putExtra("extra_description", paramab.field_packDesc);
    localIntent.putExtra("extra_price", paramab.field_packPrice);
    localIntent.putExtra("extra_type", paramab.field_packType);
    localIntent.putExtra("extra_flag", paramab.field_packFlag);
    if (!ch.jb(this.hIA.aEp()))
      localIntent.putExtra("to_talker_name", this.hIA.aEp());
    localIntent.putExtra("extra_flag", 1);
    localIntent.putExtra("preceding_scence", 1);
    localIntent.putExtra("call_by", 2);
    localIntent.putExtra("entrance_scence", 5);
    localIntent.putExtra("check_clickflag", false);
    com.tencent.mm.am.a.b(this.dkf, "emoji", ".ui.EmojiStoreDetailUI", localIntent);
  }

  private View findViewById(int paramInt)
  {
    return this.aL.findViewById(paramInt);
  }

  private void ni(int paramInt)
  {
    if (this.hJp == null);
    int i;
    do
    {
      return;
      i = this.hJp.getMeasuredWidth();
    }
    while (i <= 0);
    int j = this.hIA.aDL();
    if ((this.hJt != null) && (this.hJt.getVisibility() == 0))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(j);
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "has right store tab , so need cut this width: %d", arrayOfObject2);
    }
    for (int k = j; ; k = 0)
    {
      int m = this.hJo.getWidth() - k;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      z.i("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "tabAllWidth: %d", arrayOfObject1);
      int n = i - m;
      if (n <= 0)
        break;
      int i1 = this.hJo.getScrollX();
      if ((i1 > 0) && (i1 >= j * paramInt))
      {
        this.hJo.scrollTo(paramInt * j, 0);
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "adjusting tab site --- to left.");
      }
      if ((i1 >= n) || (i1 + m >= j * (paramInt + 1)))
        break;
      this.hJo.scrollTo(j * (paramInt + 1) - m, 0);
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "adjusting tab site --- to right.");
      return;
    }
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void a(MMRadioGroupView paramMMRadioGroupView, int paramInt)
  {
    if ((this.aL == null) || (!this.hIA.aEm()))
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "onCheckedChanged not end loading but catch check tab, current deal pass~");
    MMRadioImageButton localMMRadioImageButton;
    String str;
    do
    {
      ImageView localImageView;
      do
      {
        return;
        if ((this.hJm == null) || (this.hJn == null))
        {
          z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "onCheckedChanged not end initView but catch check tab, current deal pass~");
          return;
        }
        localImageView = (ImageView)paramMMRadioGroupView.findViewById(paramInt);
      }
      while (!(localImageView instanceof MMRadioImageButton));
      localMMRadioImageButton = (MMRadioImageButton)localImageView;
      str = (String)localMMRadioImageButton.getTag();
      if (ch.jb(str))
      {
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "onCheckedChanged productId = null, pass~");
        return;
      }
      if (this.hIA.vT(str) == null)
      {
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "onCheckedChanged getTab null pass~");
        return;
      }
    }
    while ((this.hIA.vS(str)) || (str.equals("TAG_STORE_TAB")));
    if ((!str.equals(String.valueOf(ab.iiH))) && (!str.equals(String.valueOf(ab.iiI))) && (!str.equals("TAG_DEFAULT_TAB")))
    {
      ab localab = (ab)localMMRadioImageButton.getTag(com.tencent.mm.n.bEO);
      if (localab == null)
        break label316;
      if (i.c(localab))
      {
        e(localab);
        return;
      }
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = str;
    z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "check, viewId: %d, proId: %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(paramInt);
    arrayOfObject2[1] = str;
    z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "show TAB: viewId: %d, tabProductId: %s", arrayOfObject2);
    this.hIA.vR(str);
    aEI();
    label316: if (this.hJA)
    {
      this.hIA.aEq();
      this.hJA = false;
      return;
    }
    this.hJm.a(this.hIA.vT(str).aDt(), false);
  }

  public final bb aDy()
  {
    if (this.hJw == null)
      return null;
    return this.hJw.aDy();
  }

  public final void aED()
  {
    if (this.hJs == null)
      return;
    if (i.aDG())
    {
      this.hJs.setBackgroundResource(com.tencent.mm.h.SS);
      this.hJt.setBackgroundResource(com.tencent.mm.h.SU);
      return;
    }
    this.hJs.setBackgroundResource(com.tencent.mm.h.SR);
    this.hJt.setBackgroundResource(com.tencent.mm.h.ST);
  }

  public final com.tencent.mm.pluginsdk.ui.h aEG()
  {
    if (this.hJw == null)
      return null;
    return this.hJw.aEL();
  }

  public final SmileyPanelVP aEH()
  {
    return this.hJm;
  }

  public final void aEI()
  {
    i locali = this.hIA;
    if (locali.vS("TAG_DEFAULT_TAB"))
    {
      if ((this.hJw != null) && (this.hJw.aEL() != null))
        this.hJw.aEL().cs(true);
      if (this.hIA.aDV())
      {
        this.hIA.dP(false);
        aEE().setVisibility(0);
        if ((this.hJv != null) && (this.hJv.getVisibility() != 0))
        {
          TranslateAnimation localTranslateAnimation = new TranslateAnimation(this.hJv.getWidth(), 0.0F, 0.0F, 0.0F);
          localTranslateAnimation.setDuration(250L);
          this.hJv.startAnimation(localTranslateAnimation);
          this.hJv.setVisibility(0);
          aEz();
        }
      }
      return;
    }
    if ((this.hJw != null) && (this.hJw.aEL() != null))
      this.hJw.aEL().cs(false);
    dV(true);
  }

  public final void aEJ()
  {
    if (this.hJo != null)
      this.hJo.setVisibility(8);
  }

  public final void aEK()
  {
    this.hJx.cP(5L);
  }

  public final Context aEv()
  {
    return this.eAJ;
  }

  public final void aEw()
  {
    if (a.hIe.aDn())
    {
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "check neeed refresh & refresh safe");
      aEK();
    }
    while (true)
    {
      this.hIA.dR(false);
      return;
      if (this.hIA.aEd())
      {
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "check neeed refresh & refresh View");
        aEx();
      }
    }
  }

  public final void aEy()
  {
    if (this.hJn != null)
      this.hJn.clear();
  }

  public final void b(MMRadioGroupView paramMMRadioGroupView, int paramInt)
  {
    if (paramInt < 0);
    label4: ab localab;
    do
    {
      MMRadioImageButton localMMRadioImageButton;
      String str;
      do
      {
        do
        {
          break label4;
          do
            return;
          while (!(paramMMRadioGroupView.findViewById(paramInt) instanceof MMRadioImageButton));
          localMMRadioImageButton = (MMRadioImageButton)paramMMRadioGroupView.findViewById(paramInt);
          str = (String)localMMRadioImageButton.getTag();
        }
        while (ch.jb(str));
        if (str.equals("TAG_STORE_TAB"))
          aEF();
      }
      while ((str.equals(String.valueOf(ab.iiH))) || (str.equals(String.valueOf(ab.iiI))));
      localab = (ab)localMMRadioImageButton.getTag(com.tencent.mm.n.bEO);
    }
    while (!i.c(localab));
    e(localab);
  }

  public final void d(ViewGroup paramViewGroup)
  {
    if (paramViewGroup == null)
      return;
    if ((this.aL != null) && (paramViewGroup.getChildCount() > 0))
    {
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "already load view --- pass");
      return;
    }
    this.hIA.dT(false);
    z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "async load view");
    TextView localTextView;
    if (this.aL == null)
    {
      this.aL = View.inflate(this.dkf, k.bnx, null);
      this.hJm = ((SmileyPanelVP)findViewById(com.tencent.mm.i.aQw));
      this.hJm.a(this.hIA);
      this.hJm.a(this);
      this.hJm.a(this);
      this.hIA.na(this.hJm.getWidth());
      this.eER = ((MMDotView)findViewById(com.tencent.mm.i.aQu));
      this.eER.pt(1);
      this.hJo = ((MMSmoothHorizontalScrollView)findViewById(com.tencent.mm.i.aQx));
      this.hJp = ((MMRadioGroupView)findViewById(com.tencent.mm.i.aQt));
      this.hJv = ((TextView)findViewById(com.tencent.mm.i.aOl));
      this.hJt = ((ImageView)findViewById(com.tencent.mm.i.aMp));
      this.hJp.a(this);
      this.hJv.setOnClickListener(this);
      localTextView = this.hJv;
      if (!this.hIA.aDV())
        break label293;
    }
    label293: for (int i = 0; ; i = 8)
    {
      localTextView.setVisibility(i);
      paramViewGroup.addView(this.aL, new LinearLayout.LayoutParams(-1, -1));
      this.hIA.dT(true);
      return;
      if (this.aL.getParent() == null)
        break;
      ((ViewGroup)this.aL.getParent()).removeView(this.aL);
      break;
    }
  }

  public final void d(bb parambb)
  {
    if ((this.hJn != null) && (parambb != null))
      this.hJn.e(parambb);
  }

  public final void dV(boolean paramBoolean)
  {
    aEE().setVisibility(8);
    if (this.hJv == null);
    while (this.hJv.getVisibility() != 0)
      return;
    if (paramBoolean)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, this.hJv.getWidth(), 0.0F, 0.0F);
      localTranslateAnimation.setDuration(250L);
      this.hJv.startAnimation(localTranslateAnimation);
    }
    this.hJv.setVisibility(8);
    aEz();
  }

  public final void dW(boolean paramBoolean)
  {
    if (this.hJv != null)
      this.hJv.setEnabled(paramBoolean);
  }

  public final void destroy()
  {
    this.eAJ = null;
    if (this.hJm != null)
    {
      this.hJm.a(null);
      this.hJm = null;
    }
    if (this.hJr != null)
      this.hJr.clear();
  }

  public final void h(int paramInt)
  {
    if (this.hJB == paramInt);
    while (!this.hIA.aEm())
      return;
    this.hJB = paramInt;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "onPageSelected: %d", arrayOfObject1);
    g localg = this.hIA.nc(paramInt);
    if (localg == null)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "catch null tab in onPage Selected: %d", arrayOfObject2);
      return;
    }
    if (!this.hIA.vS(localg.JS()))
    {
      this.hIA.aEq();
      this.hJA = true;
      localg.aDC().setChecked(true);
    }
    aL(localg.aDw(), paramInt - localg.aDt());
    ni(this.hIA.nd(paramInt));
  }

  public final void i(int paramInt)
  {
  }

  public final boolean kJ()
  {
    nh(h.hII);
    return false;
  }

  public final void nh(int paramInt)
  {
    int i = 1;
    while (true)
    {
      long l1;
      int j;
      label56: int k;
      int n;
      try
      {
        if ((this.aL == null) || (!this.hIA.aEm()))
        {
          z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "not view can't deal");
          return;
        }
        l1 = System.currentTimeMillis();
        this.hIA.dQ(false);
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "- deal Data");
        j = paramInt;
        this.hJp.removeAllViews();
        if ((this.hIA.aEk() == null) || (this.hIA.aEk().size() <= 0))
          j = h.hII;
        if (j == h.hII)
          a.hIe.aDp();
        if (!a.hIe.aDn())
          break label1076;
        a.hIe.aDo();
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "smiley panel notify old version");
        k = h.hII;
        if (k == h.hII)
          this.hIA.aEh();
        switch (p.hJE[(k - 1)])
        {
        default:
          z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "Init Tabs Group Use Cache: Degree UnKonw");
          z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "start add default");
          if (k != h.hII)
            break label532;
          a("TAG_DEFAULT_TAB", aEA());
          if (aEA().getParent() != null)
            ((ViewGroup)aEA().getParent()).removeView(aEA());
          this.hJp.addView(aEA());
          if (this.hIA.aEf())
            break label787;
          z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "start add middle");
          if (k != h.hII)
            break label875;
          this.hJr = null;
          if (this.hJr != null)
            break label622;
          this.hJr = new ArrayList();
          ArrayList localArrayList2 = this.hIA.aDJ();
          if (localArrayList2 == null)
            break label661;
          i locali3 = this.hIA;
          if (locali3.vS("TAG_STORE_TAB"))
            break label1083;
          i locali5 = this.hIA;
          if (locali5.vS("TAG_DEFAULT_TAB"))
            break label1083;
          n = i;
          Iterator localIterator2 = localArrayList2.iterator();
          if (!localIterator2.hasNext())
            break label634;
          ab localab2 = (ab)localIterator2.next();
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localab2.field_productID;
          z.v("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "create middle button: %s", arrayOfObject2);
          MMRadioImageButton localMMRadioImageButton3 = d(localab2);
          if ((n != 0) && (this.hIA.vS(localab2.field_productID)))
            i = 0;
          if (localMMRadioImageButton3 != null)
            this.hJr.add(localMMRadioImageButton3);
          this.hJp.addView(localMMRadioImageButton3);
          a(localab2.field_productID, localMMRadioImageButton3);
          continue;
        case 1:
        case 2:
        case 3:
        }
      }
      finally
      {
      }
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "Init Tabs Group Use Cache: Degree First");
      continue;
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "Init Tabs Group Use Cache: Degree Second");
      continue;
      z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "Init Tabs Group Use Cache: Degree Third");
      continue;
      label532: i locali1 = this.hIA;
      g localg1 = locali1.vT("TAG_DEFAULT_TAB");
      if (localg1 == null)
      {
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "use cache error default, so Change Degree Third");
        j = h.hII;
      }
      else
      {
        if (k == h.hIG)
          localg1.a(this, this.hIA);
        while (true)
        {
          if (localg1.aDC() != null)
            break label620;
          aEA();
          break;
          localg1.b(this, this.hIA);
        }
        label620: continue;
        label622: this.hJr.clear();
        continue;
        label634: if ((n != 0) && (i != 0))
        {
          i locali4 = this.hIA;
          locali4.vR("TAG_DEFAULT_TAB");
        }
        label661: if (aEC().getParent() != null)
          ((ViewGroup)aEC().getParent()).removeView(aEB());
        this.hJp.addView(aEC());
        if (aEB().getParent() != null)
          ((ViewGroup)aEB().getParent()).removeView(aEB());
        this.hJp.addView(aEB());
        aEz();
        if (aEE().getParent() != null)
          ((ViewGroup)aEB().getParent()).removeView(aEE());
        this.hJp.addView(aEE());
        this.hJp.a(this);
        label787: if (k != h.hIG)
          this.hIA.aEl();
        z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "end initTabGroup");
        if (this.hIA.aEe())
          aEx();
        while (true)
        {
          this.hIA.dQ(true);
          long l2 = System.currentTimeMillis();
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Long.valueOf(l2 - l1);
          z.v("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "start Deal expend: %d", arrayOfObject1);
          this.hIA.aEr();
          break;
          label875: this.hJr = new ArrayList();
          ArrayList localArrayList1 = this.hIA.aDU();
          if (localArrayList1 == null)
          {
            z.v("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "Emoji Group Info Cache can't use & unuse cache retry");
            j = h.hII;
            break label56;
          }
          Iterator localIterator1 = localArrayList1.iterator();
          label923: ab localab1;
          int m;
          g localg2;
          MMRadioImageButton localMMRadioImageButton1;
          if (localIterator1.hasNext())
          {
            localab1 = (ab)localIterator1.next();
            i locali2 = this.hIA;
            m = i + 1;
            localg2 = locali2.nb(i);
            if (localg2 != null)
              break label1043;
            z.d("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "use cache middle already release.... so new one");
            localMMRadioImageButton1 = d(localab1);
            String str = (String)localMMRadioImageButton1.getTag();
            this.hIA.a(str, this, localMMRadioImageButton1.isCheckable(), m);
          }
          for (MMRadioImageButton localMMRadioImageButton2 = localMMRadioImageButton1; ; localMMRadioImageButton2 = d(localab1))
          {
            this.hJr.add(localMMRadioImageButton2);
            this.hJp.addView(localMMRadioImageButton2);
            i = m;
            break label923;
            break;
            label1043: localg2.a(this, this.hIA);
          }
          this.hIA.dR(true);
        }
        label1076: k = j;
        continue;
        label1083: n = 0;
      }
    }
  }

  public final void nj(int paramInt)
  {
    boolean bool = true;
    try
    {
      if (this.hIA.aEn())
        if (!this.hIA.aDZ());
      while (true)
      {
        z.i("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "catch Size & start deal");
        if (paramInt > 0)
          this.aL.post(new o(this, bool));
        return;
        this.hIA.aEa();
        bool = false;
        continue;
        if (!this.hIA.aEb())
        {
          this.hIA.aEc();
          bool = false;
        }
      }
    }
    finally
    {
    }
  }

  public final void nk(int paramInt)
  {
    if (paramInt > 0)
    {
      z.i("!56@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0IOGgbXorucpnUs7PCypvRw==", "tab size changed ,so adjusting tab site.");
      ni(this.hIA.aDW());
    }
  }

  public final void onClick(View paramView)
  {
    if ((paramView == this.hJs) || (paramView == this.hJt))
    {
      aEF();
      aED();
    }
    do
    {
      do
      {
        return;
        if (paramView != this.hJv)
          break;
      }
      while ((this.hJw == null) || (this.hJw.aEL() == null));
      this.hJw.aEL().aou();
      return;
    }
    while (paramView != this.hJz);
    com.tencent.mm.am.a.b(this.dkf, "emoji", ".ui.EmojiMineUI", null);
  }

  public final MMRadioImageButton vY(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    if (paramString.equals("TAG_DEFAULT_TAB"))
      return this.hJq;
    if (this.hJr == null)
      return null;
    Iterator localIterator = this.hJr.iterator();
    while (localIterator.hasNext())
    {
      MMRadioImageButton localMMRadioImageButton = (MMRadioImageButton)localIterator.next();
      if (((String)localMMRadioImageButton.getTag()).equals(paramString))
        return localMMRadioImageButton;
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.n
 * JD-Core Version:    0.6.2
 */