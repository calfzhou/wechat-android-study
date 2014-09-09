package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.cu;
import java.util.ArrayList;

public class SelectLabelContactUI extends MMActivity
{
  private ListView feW;
  private AlphabetScrollBar fqz;
  private TextView iOn;
  private dp jBr;
  private String jCj;
  private String jCk;
  private String jCl;
  private boolean jCm = true;
  private int jCn;
  private String jyE;

  protected final int getLayoutId()
  {
    return k.bmE;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jyE = getIntent().getStringExtra("label");
    this.jCm = getIntent().getBooleanExtra("single_chat", true);
    this.jCn = getIntent().getIntExtra("List_Type", -1);
    new StringBuilder("cpan[initeView]").append(this.jyE);
    this.fqz = ((AlphabetScrollBar)findViewById(i.aeL));
    this.fqz.setVisibility(8);
    this.feW = ((ListView)findViewById(i.aeA));
    this.iOn = ((TextView)findViewById(i.arK));
    this.iOn.setText(n.bsf);
    if (ch.jb(this.jyE))
    {
      if (this.jCm)
      {
        setResult(0);
        finish();
      }
    }
    else
    {
      this.jCj = g.ayc().mM(this.jyE);
      if (ch.jb(this.jCj))
      {
        if (!this.jCm)
          break label415;
        setResult(0);
        finish();
      }
    }
    ArrayList localArrayList4;
    while (true)
    {
      this.jBr = new dp(this, "@micromsg.qq.com", "");
      if (this.jCn == 4)
        this.jCm = false;
      this.jBr.fC(this.jCm);
      this.jBr.fE(false);
      this.jBr.CA("@chatroom,@chatroom_exclusive");
      this.jBr.fD(false);
      this.jBr.aXF();
      this.jBr.bf(g.ayc().nD(this.jCj));
      this.jCk = getIntent().getStringExtra("Select_Contact");
      if (ap.jb(this.jCk))
        break label435;
      ArrayList localArrayList3 = (ArrayList)ap.b(this.jCk.split(","));
      if ((localArrayList3 == null) || (localArrayList3.isEmpty()))
        break label435;
      int k = localArrayList3.size();
      localArrayList4 = new ArrayList();
      for (int m = 0; m < k; m++)
      {
        String str2 = (String)localArrayList3.get(m);
        if ((!x.cY(str2)) && (y.di(str2)))
          localArrayList4.add(str2);
      }
      this.iOn.setVisibility(0);
      break;
      label415: this.iOn.setVisibility(0);
    }
    this.jBr.bh(localArrayList4);
    label435: this.jCl = getIntent().getStringExtra("Disabled_Selected_list");
    if (!ap.jb(this.jCl))
    {
      ArrayList localArrayList1 = (ArrayList)ap.b(this.jCl.split(","));
      if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
      {
        int i = localArrayList1.size();
        ArrayList localArrayList2 = new ArrayList();
        for (int j = 0; j < i; j++)
        {
          String str1 = (String)localArrayList1.get(j);
          if ((!x.cY(str1)) && (y.di(str1)))
            localArrayList2.add(str1);
        }
        this.jBr.bh(localArrayList2);
      }
    }
    this.feW.setAdapter(this.jBr);
    this.feW.setOnItemClickListener(new fm(this));
    Bt(this.jyE);
    a(new fn(this));
    if (this.jCm)
      a(0, getString(n.btB), new fo(this), cu.iMA);
  }

  protected void onDestroy()
  {
    this.fqz.aTw();
    this.jBr.closeCursor();
    this.jBr.detach();
    this.jBr.aOD();
    super.onDestroy();
  }

  public void onResume()
  {
    super.onResume();
    if (this.jBr != null)
      this.jBr.a(null, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectLabelContactUI
 * JD-Core Version:    0.6.2
 */