package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.ui.tools.av;
import com.tencent.mm.pluginsdk.ui.tools.aw;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import java.util.ArrayList;

public class ModRemarkNameUI extends MMActivity
  implements m
{
  private com.tencent.mm.storage.i elz;
  private cn fML;
  private MMTagPanel glr;
  private String hYN = "";
  private EditText jAI;
  private int jAJ;
  private String jAK = "";
  private TextView jAL = null;
  private EditText jAM = null;
  private TextView jAN = null;
  private String jAO = "";
  private boolean jAP = false;
  private dj jAQ = new dj(this, (byte)0);
  private View jAR;
  private String jyE;
  private TextView jyW;
  private View jyX;
  private Button jyY;
  private View jyZ;
  private ArrayList jyy;
  private int jza = 9;
  private TextView jzk;
  private String user;

  private void fB(boolean paramBoolean)
  {
    bg.qX().d(new com.tencent.mm.ab.k(5));
    if ((paramBoolean) && (this.elz != null))
      bg.qW().oT().E(this.elz);
  }

  private static int v(CharSequence paramCharSequence)
  {
    return 200 - Math.round(w(paramCharSequence));
  }

  private static float w(CharSequence paramCharSequence)
  {
    float f = 0.0F;
    int i = 0;
    if (i < paramCharSequence.length())
    {
      if (ap.l(paramCharSequence.charAt(i)));
      for (f += 1.0F; ; f += 0.5F)
      {
        i++;
        break;
      }
    }
    return f;
  }

  protected final void DP()
  {
    this.user = getIntent().getStringExtra("Contact_User");
    if ((this.user != null) && (this.user.length() > 0))
    {
      this.elz = bg.qW().oT().ys(this.user);
      this.fML = bg.qW().oU().Ab(this.user);
      if ((this.elz == null) || (ap.jb(this.elz.getUsername())))
      {
        this.elz = new com.tencent.mm.storage.i(this.user);
        this.elz.aU(ap.ja(this.jAK));
        this.elz.aT(ap.ja(this.hYN));
      }
    }
    this.jAI = ((EditText)findViewById(com.tencent.mm.i.anP));
    de localde = new de(this);
    label245: com.tencent.mm.modelfriend.i locali;
    if ((this.jAJ == 1) || (this.jAJ == 2) || (this.jAJ == 3))
    {
      aw localaw1 = new aw();
      localaw1.a(localde);
      this.jAI.addTextChangedListener(localaw1);
      this.jAI.setFilters(av.hLZ);
      if ((this.elz != null) && (this.jAJ != 3))
      {
        if (this.jAJ != 4)
          break label598;
        this.jAI.setText(this.jAK);
        this.jAI.setSelection(this.jAI.getText().length());
      }
      if (this.jAJ != 0)
        break label885;
      oP(n.bCh);
      locali = az.wZ().gl(this.elz.getUsername());
      if ((locali != null) && (!ap.jb(locali.vw())) && (!locali.vw().equals(this.jAI.getText())))
        break label779;
      label327: a(0, getString(n.bud), new df(this));
      if ((this.jAI == null) || (this.jAI.getText().toString().trim().length() <= 0))
        break label1070;
      eB(true);
    }
    while (true)
    {
      a(new dg(this));
      this.jAL = ((TextView)findViewById(com.tencent.mm.i.anO));
      this.jAM = ((EditText)findViewById(com.tencent.mm.i.anN));
      this.jAN = ((TextView)findViewById(com.tencent.mm.i.baa));
      this.jyZ = findViewById(com.tencent.mm.i.anM);
      EditText localEditText = this.jAM;
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new dk(this);
      localEditText.setFilters(arrayOfInputFilter);
      this.jAM.addTextChangedListener(new dl(this, (byte)0));
      this.jAM.setOnFocusChangeListener(new dh(this));
      this.jAN.setText(v(this.jAM.getEditableText()));
      this.jAM.append(ap.ja(this.jAO));
      if (this.fML != null)
        this.jAM.setText(this.fML.field_conDescription);
      return;
      aw localaw2 = new aw();
      localaw2.a(localde);
      this.jAI.addTextChangedListener(localaw2);
      break;
      label598: if (!ap.jb(this.elz.ja()))
      {
        this.jAI.setText(this.elz.ja());
        break label245;
      }
      if (!ap.jb(this.hYN))
      {
        this.jAI.setText(this.hYN);
        break label245;
      }
      if (!ap.jb(this.elz.iV()))
      {
        this.jAI.setText(this.elz.iV());
        break label245;
      }
      if (!ap.jb(this.jAK))
      {
        this.jAI.setText(this.jAK);
        break label245;
      }
      String str = this.elz.iV();
      if ((ap.jb(str)) || (str.length() > 50));
      for (int j = 0; ; j = 1)
      {
        if (j == 0)
          break label767;
        this.jAI.setText(ap.ja(this.elz.od()));
        break;
      }
      label767: this.jAI.setText("");
      break label245;
      label779: this.jyW = ((TextView)findViewById(com.tencent.mm.i.aES));
      this.jyX = findViewById(com.tencent.mm.i.aEQ);
      this.jyY = ((Button)findViewById(com.tencent.mm.i.aET));
      this.jyX.setVisibility(0);
      TextView localTextView4 = this.jyW;
      int i = n.bCZ;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = locali.vw();
      localTextView4.setText(getString(i, arrayOfObject));
      this.jyY.setOnClickListener(new di(this, locali));
      break label327;
      label885: if (this.jAJ == 1)
      {
        oP(n.caO);
        this.jAI.setHint("");
        TextView localTextView3 = (TextView)findViewById(com.tencent.mm.i.anQ);
        localTextView3.setText("");
        localTextView3.setVisibility(0);
        break label327;
      }
      if (this.jAJ == 2)
      {
        oP(n.cbb);
        this.jAI.setHint("");
        break label327;
      }
      if (this.jAJ == 3)
      {
        oP(n.ckV);
        this.jAI.setHint("");
        TextView localTextView2 = (TextView)findViewById(com.tencent.mm.i.anQ);
        localTextView2.setText(n.cev);
        localTextView2.setVisibility(0);
        break label327;
      }
      if (this.jAJ != 4)
        break label327;
      oP(n.caN);
      this.jAI.setHint("");
      TextView localTextView1 = (TextView)findViewById(com.tencent.mm.i.anQ);
      localTextView1.setText(n.cbg);
      localTextView1.setVisibility(0);
      break label327;
      label1070: eB(false);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@9DU/RFsdGl+RDQXDdsDwXSf1gIUFYGLx", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramx.getType() == 44)
    {
      if ((paramInt1 != 0) && (paramInt2 < 0))
      {
        z.d("!32@9DU/RFsdGl+RDQXDdsDwXSf1gIUFYGLx", "addRoomCard Error!");
        int i = n.cbc;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(this, getString(i, arrayOfObject), 0).show();
      }
      finish();
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bjT;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jza = getIntent().getIntExtra("Contact_Scene", 9);
    this.jAJ = getIntent().getIntExtra("Contact_mode_name_type", 0);
    this.jAK = ap.ja(getIntent().getStringExtra("Contact_Nick"));
    this.hYN = ap.ja(getIntent().getStringExtra("Contact_RemarkName"));
    this.jAP = getIntent().getBooleanExtra("Contact_ModStrangerRemark", false);
    DP();
    this.jAR = findViewById(com.tencent.mm.i.anK);
    if (this.jAJ != 0)
      this.jAR.setVisibility(8);
    while (true)
    {
      this.glr = ((MMTagPanel)findViewById(com.tencent.mm.i.anL));
      this.glr.jcx = false;
      this.jzk = ((TextView)findViewById(com.tencent.mm.i.anJ));
      this.jzk.setText(n.bSU);
      this.glr.setOnClickListener(this.jAQ);
      this.jzk.setOnClickListener(this.jAQ);
      return;
      this.jAR.setVisibility(0);
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
    this.fML = bg.qW().oU().Ab(this.user);
    if (this.fML != null)
    {
      this.jyE = this.fML.field_contactLabels;
      this.jyy = ((ArrayList)g.ayc().nB(this.jyE));
    }
    if (!ap.jb(this.jyE))
    {
      this.glr.setVisibility(0);
      this.jzk.setVisibility(8);
      if ((this.jyy != null) && (!this.jyy.isEmpty()))
        this.glr.a(this.jyy, this.jyy);
      return;
    }
    this.glr.setVisibility(8);
    this.jzk.setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ModRemarkNameUI
 * JD-Core Version:    0.6.2
 */