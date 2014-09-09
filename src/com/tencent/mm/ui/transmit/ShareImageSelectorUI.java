package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.mm.c.a.ar;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.au;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import java.util.ArrayList;

public class ShareImageSelectorUI extends MMActivity
  implements AdapterView.OnItemClickListener
{
  private static int jYI = 1;
  private View eDo;
  private ImageView eHV;
  private ListView erL;
  private int jYJ = 2;
  private String jYK;
  private an jYL;
  private au jYM;
  private View.OnClickListener jYN = new ag(this);
  private cm mHandler = new ah(this);

  private void WZ()
  {
    com.tencent.mm.ui.base.e.a(aPI(), getString(com.tencent.mm.n.bDU), getString(com.tencent.mm.n.bDW), true, new aj(this), new ak(this));
  }

  private void bbT()
  {
    if ((this.jYM != null) && (this.jYM.isShowing()))
      return;
    String[] arrayOfString = new String[3];
    arrayOfString[0] = getString(com.tencent.mm.n.bDY);
    arrayOfString[1] = getString(com.tencent.mm.n.bDZ);
    arrayOfString[2] = getString(com.tencent.mm.n.bDX);
    this.jYM = com.tencent.mm.ui.base.e.a(aPI(), getString(com.tencent.mm.n.bSz), arrayOfString, null, new al(this), new am(this));
  }

  private void bbU()
  {
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("Contact_GroupFilter_Type", "@all.contact.without.chatroom");
    localIntent.putExtra("List_Type", 11);
    localIntent.putExtra("Need_Group_Item", false);
    localIntent.putExtra("shareImage", true);
    localIntent.putExtra("shareImagePath", this.jYK);
    startActivityForResult(localIntent, 1001);
  }

  private void bbV()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_type", 0);
    localIntent.putExtra("sns_kemdia_path", this.jYK);
    localIntent.putExtra("need_result", true);
    com.tencent.mm.am.a.a(aPI(), "sns", ".ui.SnsUploadUI", localIntent, 1002);
  }

  private void bbW()
  {
    ar localar = new ar();
    if ((c.a(localar, 6, this.jYK)) && (localar.cHV.ret == 0))
    {
      com.tencent.mm.sdk.c.a.aGB().g(localar);
      com.tencent.mm.ui.base.e.aw(aPI(), getString(com.tencent.mm.n.bHR));
    }
    while (true)
    {
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = Integer.valueOf(0);
      arrayOfObject[2] = Integer.valueOf(0);
      localn.d(11048, arrayOfObject);
      if (this.mHandler != null)
        this.mHandler.sendEmptyMessageDelayed(0, 800L);
      return;
      com.tencent.mm.ui.base.e.b(aPI(), localar.cHU.type, com.tencent.mm.n.bHn);
    }
  }

  protected final int It()
  {
    return 1;
  }

  protected final int getLayoutId()
  {
    return k.bnl;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.d("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "requestCode:%d , resultCode:%d", arrayOfObject);
    switch (paramInt1)
    {
    default:
      z.w("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "unknow result");
      return;
    case 1001:
      if (paramInt2 == -1)
      {
        ArrayList localArrayList = null;
        if (paramIntent != null)
          localArrayList = paramIntent.getStringArrayListExtra("Select_Contact");
        if ((localArrayList != null) && (localArrayList.size() == 1))
        {
          Intent localIntent = new Intent(this, ChattingUI.class);
          localIntent.putExtra("Chat_User", (String)localArrayList.get(0));
          startActivity(localIntent);
        }
        finish();
        return;
      }
      z.w("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "user cancle");
      return;
    case 1002:
    }
    if (paramInt2 == -1)
    {
      Toast.makeText(aPI(), com.tencent.mm.n.bAR, 0).show();
      finish();
      return;
    }
    z.w("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "user cancle");
  }

  public void onBackPressed()
  {
    WZ();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = bg.qW().oQ().get(229635);
    if ((localObject instanceof Integer))
    {
      int j = ((Integer)localObject).intValue();
      if ((j == 0) || (j == 1))
        jYI = j;
    }
    oP(com.tencent.mm.n.bSz);
    a(new ai(this));
    this.jYJ = getIntent().getIntExtra("Select_Conv_Type", 2);
    this.jYK = getIntent().getStringExtra("intent_extra_image_path");
    this.eDo = findViewById(com.tencent.mm.i.aBl);
    this.eHV = ((ImageView)findViewById(com.tencent.mm.i.axK));
    this.eHV.setOnClickListener(this.jYN);
    this.erL = ((ListView)findViewById(com.tencent.mm.i.list));
    this.jYL = new an(this);
    this.erL.setAdapter(this.jYL);
    this.erL.setOnItemClickListener(this);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.jYJ;
    arrayOfObject1[1] = this.jYK;
    z.d("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "mSelectType:%s ImagePath:%s", arrayOfObject1);
    if (jYI == 1)
    {
      oO(8);
      this.erL.setVisibility(8);
      this.eHV.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      this.eHV.setPadding(0, 0, 0, 0);
      this.eHV.setOnClickListener(null);
      this.eDo.setBackgroundColor(getResources().getColor(com.tencent.mm.f.NZ));
      bbT();
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap1 = s.jA(this.jYK);
    int i = com.tencent.mm.sdk.platformtools.f.iM(this.jYK);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i);
    z.d("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "cpan [onCreate]degree:%d", arrayOfObject2);
    Bitmap localBitmap2 = com.tencent.mm.sdk.platformtools.i.a(localBitmap1, i);
    if ((localBitmap2 != null) && (!localBitmap2.isRecycled()))
      this.eHV.setImageBitmap(localBitmap2);
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = (System.currentTimeMillis() - l + "'");
    z.d("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "cpan[onCreate] Read Bitmap Time:%s", arrayOfObject3);
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default:
      z.e("!44@/B4Tb64lLpIPG1BmaCV8Iks+xbMm/hgife9upnywcQQ=", "unknow postion.");
      return;
    case 0:
      bbU();
      return;
    case 1:
      bbV();
      return;
    case 2:
    }
    bbW();
  }

  protected void onResume()
  {
    super.onResume();
    if ((jYI == 1) && ((this.jYM == null) || (!this.jYM.isShowing())))
      bbT();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ShareImageSelectorUI
 * JD-Core Version:    0.6.2
 */