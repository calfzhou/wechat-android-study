package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.a.k;
import com.tencent.mm.aq.a;
import com.tencent.mm.ar.b;
import com.tencent.mm.h;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.n.p;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;

public class VerifyUserHeaderPreference extends Preference
  implements p, m, as
{
  private int cNS;
  private Context context;
  private ImageView dXf;
  private TextView efn;
  private com.tencent.mm.storage.i elz;
  private TextView frE;
  private boolean hHI = false;
  private long ijA;
  private TextView jEP;
  private TextView jEQ;
  private ImageView jER;
  private TextView jES;
  private TextView jET;
  private TextView jEU;
  private TextView jEV;
  private TextView jEW;
  private String jEX = "";
  private String jEY;
  private String jEZ;
  private int jza;

  public VerifyUserHeaderPreference(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
  }

  public VerifyUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  public VerifyUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  private static String CR(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      z.e("!56@/B4Tb64lLpIwSNtxdf/l2PbLOm1eGeUzDikfsnJc5Upw9X/HhnX5vA==", "getLocalMobileRemark : phoneMD5 null");
      return "";
    }
    com.tencent.mm.modelfriend.i locali = az.wZ().gn(paramString);
    if ((locali == null) || (locali.vw() == null))
    {
      z.e("!56@/B4Tb64lLpIwSNtxdf/l2PbLOm1eGeUzDikfsnJc5Upw9X/HhnX5vA==", "getLocalMobileRemark : not in phone addr");
      return "";
    }
    return locali.vw();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
  }

  public final void eX(String paramString)
  {
  }

  public final void onBindView(View paramView)
  {
    z.d("!56@/B4Tb64lLpIwSNtxdf/l2PbLOm1eGeUzDikfsnJc5Upw9X/HhnX5vA==", "onBindView");
    this.jEP = ((TextView)paramView.findViewById(com.tencent.mm.i.aUF));
    this.jEQ = ((TextView)paramView.findViewById(com.tencent.mm.i.aUE));
    this.dXf = ((ImageView)paramView.findViewById(com.tencent.mm.i.aUD));
    this.efn = ((TextView)paramView.findViewById(com.tencent.mm.i.aUK));
    this.jER = ((ImageView)paramView.findViewById(com.tencent.mm.i.aoe));
    this.jES = ((TextView)paramView.findViewById(com.tencent.mm.i.aUG));
    this.jET = ((TextView)paramView.findViewById(com.tencent.mm.i.aUL));
    this.frE = ((TextView)paramView.findViewById(com.tencent.mm.i.aUI));
    this.jEU = ((TextView)paramView.findViewById(com.tencent.mm.i.aUH));
    this.jEV = ((TextView)paramView.findViewById(com.tencent.mm.i.aUM));
    this.jEW = ((TextView)paramView.findViewById(com.tencent.mm.i.aUJ));
    this.hHI = true;
    int i;
    if ((this.hHI) && (this.elz != null))
    {
      i = 1;
      if (i != 0)
        break label233;
      z.w("!56@/B4Tb64lLpIwSNtxdf/l2PbLOm1eGeUzDikfsnJc5Upw9X/HhnX5vA==", "initView : bindView = " + this.hHI + "contact = " + this.elz);
    }
    while (true)
    {
      super.onBindView(paramView);
      return;
      i = 0;
      break;
      label233: if (this.cNS == 37)
      {
        this.jEQ.setText(this.elz.oc() + ": " + this.jEX);
        switch (this.jza)
        {
        case 19:
        case 20:
        case 21:
        default:
          this.jEP.setText(n.bzb);
          label362: if ((this.elz.jp() != null) && (!this.elz.jp().equals("")) && (this.elz.jq() != null) && (!this.elz.jq().equals("")))
          {
            this.jES.setText(y.dX(this.elz.jp()) + "  " + this.elz.jq());
            this.jES.setVisibility(0);
            this.jEU.setVisibility(0);
            if ((this.elz.jo() == null) || (this.elz.jo().trim().equals("")))
              break label1094;
            TextView localTextView3 = this.frE;
            localTextView3.setText(b.e(this.context, this.elz.jo(), -2));
            this.frE.setVisibility(0);
            this.jEW.setVisibility(0);
            if (y.p(this.elz))
            {
              if ((this.elz.jt() == null) || (this.elz.jt().equals("")))
                break label1115;
              TextView localTextView2 = this.jET;
              StringBuilder localStringBuilder2 = new StringBuilder().append(com.tencent.mm.platformtools.ap.Y(this.elz.jf(), ""));
              Context localContext = this.context;
              int j = n.cgT;
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = y.dW(this.elz.jt());
              localTextView2.setText(localContext.getString(j, arrayOfObject));
              this.jET.setVisibility(0);
              this.jEV.setVisibility(0);
            }
            if (c.a(this.elz.getUsername(), false, -1) == null)
              break label1136;
            this.dXf.setImageBitmap(c.a(this.elz.getUsername(), false, -1));
          }
          break;
        case 18:
        case 22:
        case 23:
        case 24:
        case 26:
        case 27:
        case 28:
        case 29:
        case 30:
        case 25:
        }
      }
      while (true)
      {
        label473: this.efn.setText(this.elz.iV());
        label549: label683: this.jER.setVisibility(0);
        if (this.elz.jj() != 1)
          break label1149;
        this.jER.setImageDrawable(a.n(this.context, h.VQ));
        this.jER.setContentDescription(getContext().getString(n.bVO));
        break;
        this.jEP.setText(n.bzf);
        break label362;
        this.jEP.setText(n.bzh);
        break label362;
        this.jEP.setText(n.bWQ);
        break label362;
        this.jEP.setText(n.bza);
        break label362;
        if (this.cNS != 40)
          break label362;
        switch (this.jza)
        {
        default:
          this.jEP.setText(n.byW);
          this.jEQ.setVisibility(8);
          break;
        case 4:
          this.jEP.setText(n.byO);
          String str5 = this.context.getString(n.byP);
          this.jEQ.setText(str5 + new k(this.ijA).longValue());
          break;
        case 10:
        case 11:
          String str1 = this.context.getString(n.byV);
          this.jEP.setText(n.byU);
          TextView localTextView1 = this.jEQ;
          StringBuilder localStringBuilder1 = new StringBuilder().append(str1);
          String str2 = this.jEY;
          String str3 = this.jEZ;
          String str4 = CR(str2);
          if ((str4 == null) || (str4.equals("")))
            str4 = CR(str3);
          localTextView1.setText(str4);
          break;
          this.jES.setVisibility(8);
          this.jEU.setVisibility(8);
          break label473;
          label1094: this.frE.setVisibility(8);
          this.jEW.setVisibility(8);
          break label549;
          label1115: this.jET.setVisibility(8);
          this.jEV.setVisibility(8);
          break label683;
          label1136: this.dXf.setImageResource(h.Ut);
        }
      }
      label1149: if (this.elz.jj() == 2)
      {
        this.jER.setImageDrawable(a.n(this.context, h.VP));
        this.jER.setContentDescription(getContext().getString(n.bVN));
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.VerifyUserHeaderPreference
 * JD-Core Version:    0.6.2
 */