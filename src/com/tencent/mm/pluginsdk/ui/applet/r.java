package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ar.b;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.cg;
import junit.framework.Assert;

public final class r
{
  public static cn a(cg paramcg, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, aa paramaa)
  {
    return a(paramcg, paramInt, paramString1, paramString2, paramString3, paramBoolean, "", paramaa);
  }

  public static cn a(cg paramcg, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, aa paramaa)
  {
    View localView = r(paramcg.aPI(), k.bdr);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, paramBoolean);
    a(localView, paramcg);
    if (!ch.jb(paramString4))
      a(localView, com.tencent.mm.i.ang, paramString4);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString2, (int)localTextView2.getTextSize()));
    TextView localTextView3 = (TextView)localView.findViewById(com.tencent.mm.i.ann);
    ImageView localImageView;
    if ((paramString3 == null) || (paramString3.length() == 0))
    {
      localTextView3.setVisibility(8);
      localImageView = (ImageView)localView.findViewById(com.tencent.mm.i.anp);
      if (localImageView != null)
      {
        if (paramInt <= 0)
          break label213;
        localImageView.setImageResource(paramInt);
      }
    }
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      localTextView3.setText(paramString3);
      localTextView3.setVisibility(0);
      break;
      label213: localImageView.setVisibility(8);
    }
  }

  public static cn a(cg paramcg, Bitmap paramBitmap, String paramString, aa paramaa)
  {
    View localView = r(paramcg.aPI(), k.bdu);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    if (ch.jb(paramString))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem7 fail, message is empty");
      return null;
    }
    TextView localTextView = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView.setText(b.e(paramcg.aPI(), paramString, (int)localTextView.getTextSize()));
    Button localButton = (Button)localView.findViewById(com.tencent.mm.i.ang);
    a(localcn, localView, com.tencent.mm.i.anp, paramBitmap, true);
    localButton.setOnClickListener(new s(paramaa, localView, localcn));
    a(paramcg, localcn);
    return localcn;
  }

  public static cn a(cg paramcg, Bitmap paramBitmap, String paramString1, String paramString2, String paramString3, aa paramaa)
  {
    View localView = r(paramcg.aPI(), k.bdr);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, true);
    a(localView, paramcg);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString2, (int)localTextView2.getTextSize()));
    TextView localTextView3 = (TextView)localView.findViewById(com.tencent.mm.i.ann);
    ImageView localImageView;
    if ((paramString3 == null) || (paramString3.length() == 0))
    {
      localTextView3.setVisibility(8);
      localImageView = (ImageView)localView.findViewById(com.tencent.mm.i.anp);
      if (localImageView != null)
      {
        if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
          break label205;
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem4, thumbBmp is null or recycled");
        localImageView.setVisibility(8);
      }
    }
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      localTextView3.setText(paramString3);
      localTextView3.setVisibility(0);
      break;
      label205: localImageView.setVisibility(0);
      localImageView.setImageBitmap(paramBitmap);
      a(localcn, paramBitmap);
    }
  }

  public static cn a(cg paramcg, String paramString1, Bitmap paramBitmap, String paramString2, String paramString3, int paramInt, boolean paramBoolean, aa paramaa)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem6 fail, title message both are empty");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdt);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, false);
    a(localView, paramcg);
    ((Button)localView.findViewById(com.tencent.mm.i.ang)).setText(paramInt);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString2, (int)localTextView2.getTextSize()));
    ImageView localImageView;
    if (paramString3.length() == 0)
    {
      localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
      localImageView = (ImageView)localView.findViewById(com.tencent.mm.i.anp);
      if (localImageView != null)
      {
        if ((paramBitmap == null) || (paramBitmap.isRecycled()))
          break label261;
        localImageView.setImageBitmap(paramBitmap);
        a(localcn, paramBitmap);
      }
    }
    while (true)
    {
      if (paramBoolean)
        ((ImageView)localView.findViewById(com.tencent.mm.i.anf)).setVisibility(0);
      a(paramcg, localcn);
      return localcn;
      ((TextView)localView.findViewById(com.tencent.mm.i.ann)).setText(paramString3);
      break;
      label261: localImageView.setVisibility(4);
    }
  }

  public static cn a(cg paramcg, String paramString1, String paramString2, aa paramaa1, aa paramaa2)
  {
    View localView = r(paramcg.aPI(), k.bds);
    cn localcn = ad(localView);
    ((Button)localView.findViewById(com.tencent.mm.i.ang)).setOnClickListener(new w(paramaa1, localView, localcn));
    ((Button)localView.findViewById(com.tencent.mm.i.ani)).setOnClickListener(new x(paramaa2, localView, localcn));
    a(localView, com.tencent.mm.i.ang, paramString1);
    a(localView, com.tencent.mm.i.ani, paramString2);
    ((Button)localView.findViewById(com.tencent.mm.i.ani)).setVisibility(0);
    a(paramcg, localcn);
    return localcn;
  }

  public static cn a(cg paramcg, String paramString1, String paramString2, String paramString3, String paramString4, aa paramaa)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString3 == null) || (paramString3.length() == 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem1 fail, title message both are empty");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdo);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, true);
    a(localView, paramcg);
    if (paramString4 != null)
      ((Button)localView.findViewById(com.tencent.mm.i.ang)).setText(paramString4);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    if (paramString1.length() == 0)
    {
      localTextView1.setVisibility(8);
      localView.findViewById(com.tencent.mm.i.anq).setVisibility(8);
    }
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString3, (int)localTextView2.getTextSize()));
    localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
    int i = e.a(paramcg.aPI(), 120.0F);
    CdnImageView localCdnImageView = (CdnImageView)localView.findViewById(com.tencent.mm.i.anp);
    if (localCdnImageView != null)
      localCdnImageView.n(paramString2, i, i);
    a(paramcg, localcn);
    return localcn;
  }

  public static cn a(cg paramcg, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, aa paramaa)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString3 == null) || (paramString3.length() == 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem1 fail, title message both are empty");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdo);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    if (localView != null)
    {
      EditText localEditText = (EditText)localView.findViewById(com.tencent.mm.i.ano);
      if (localEditText != null)
        localEditText.setVisibility(0);
      localEditText.setText(paramString4);
    }
    a(localView, paramcg);
    if (paramString5 != null)
      ((Button)localView.findViewById(com.tencent.mm.i.ang)).setText(paramString5);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    if (paramString1.length() == 0)
    {
      localTextView1.setVisibility(8);
      localView.findViewById(com.tencent.mm.i.anq).setVisibility(8);
    }
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString3, (int)localTextView2.getTextSize()));
    localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
    int i = e.a(paramcg.aPI(), 120.0F);
    CdnImageView localCdnImageView = (CdnImageView)localView.findViewById(com.tencent.mm.i.anp);
    if (localCdnImageView != null)
      localCdnImageView.n(paramString2, i, i);
    a(paramcg, localcn);
    return localcn;
  }

  public static cn a(cg paramcg, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, aa paramaa)
  {
    if (((paramString3 == null) || (paramString3.length() == 0)) && ((paramString4 == null) || (paramString4.length() == 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem4 fail, title message both are empty");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdr);
    cn localcn = ad(localView);
    if (!ch.jb(paramString2))
    {
      TextView localTextView4 = (TextView)localView.findViewById(com.tencent.mm.i.bFR);
      localTextView4.setText(paramString2);
      localTextView4.setVisibility(0);
      localView.findViewById(com.tencent.mm.i.bDS).setVisibility(0);
    }
    a(localView, paramaa, localcn);
    c(localView, false);
    a(localView, paramcg);
    if (paramString6 != null)
      ((Button)localView.findViewById(com.tencent.mm.i.ang)).setText(paramString6);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString3, (int)localTextView1.getTextSize()));
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString4, (int)localTextView2.getTextSize()));
    TextView localTextView3 = (TextView)localView.findViewById(com.tencent.mm.i.ann);
    if (paramString5.length() == 0)
      localTextView3.setVisibility(8);
    while (true)
    {
      int i = e.a(paramcg.aPI(), 120.0F);
      CdnImageView localCdnImageView = (CdnImageView)localView.findViewById(com.tencent.mm.i.anp);
      if (localCdnImageView != null)
        localCdnImageView.n(paramString1, i, i);
      a(paramcg, localcn);
      return localcn;
      localTextView3.setText(paramString5);
      localTextView3.setVisibility(0);
    }
  }

  public static cn a(cg paramcg, String paramString1, String paramString2, boolean paramBoolean, aa paramaa)
  {
    return a(paramcg, paramString1, paramString2, paramBoolean, "", paramaa);
  }

  public static cn a(cg paramcg, String paramString1, String paramString2, boolean paramBoolean, String paramString3, aa paramaa)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem2 fail, message is empty");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdp);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, paramBoolean);
    a(localView, paramcg);
    if (!ch.jb(paramString3))
      a(localView, com.tencent.mm.i.ang, paramString3);
    TextView localTextView = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView.getTextSize()));
    if ((paramString2 == null) || (paramString2.length() == 0))
      localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      ((TextView)localView.findViewById(com.tencent.mm.i.ann)).setText(paramString2);
    }
  }

  public static cn a(cg paramcg, String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3, boolean paramBoolean, aa paramaa)
  {
    return a(paramcg, paramString1, paramArrayOfByte, paramString2, paramString3, paramBoolean, "", paramaa);
  }

  public static cn a(cg paramcg, String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3, boolean paramBoolean, String paramString4, aa paramaa)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem1 fail, title message both are empty");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdo);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, paramBoolean);
    a(localView, paramcg);
    if (!ch.jb(paramString4))
      a(localView, com.tencent.mm.i.ang, paramString4);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString2, (int)localTextView2.getTextSize()));
    ImageView localImageView;
    if ((paramString3 == null) || (paramString3.length() == 0))
    {
      localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
      localImageView = (ImageView)localView.findViewById(com.tencent.mm.i.anp);
      if (localImageView != null)
      {
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
          break label273;
        Bitmap localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
        if (localBitmap == null)
          break label263;
        localImageView.setImageBitmap(localBitmap);
        a(localcn, localBitmap);
      }
    }
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      ((TextView)localView.findViewById(com.tencent.mm.i.ann)).setText(paramString3);
      break;
      label263: localImageView.setVisibility(8);
      continue;
      label273: localImageView.setVisibility(8);
    }
  }

  public static cn a(cg paramcg, byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt, aa paramaa)
  {
    return a(paramcg, paramArrayOfByte, paramString1, paramString2, paramString3, paramBoolean, paramInt, "", paramaa);
  }

  public static cn a(cg paramcg, byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt, String paramString4, aa paramaa)
  {
    View localView = r(paramcg.aPI(), k.bdr);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, paramBoolean);
    a(localView, paramcg);
    if (!ch.jb(paramString4))
      a(localView, com.tencent.mm.i.ang, paramString4);
    TextView localTextView1 = (TextView)localView.findViewById(com.tencent.mm.i.anr);
    localTextView1.setText(b.e(paramcg.aPI(), paramString1, (int)localTextView1.getTextSize()));
    TextView localTextView2 = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    localTextView2.setText(b.e(paramcg.aPI(), paramString2, (int)localTextView2.getTextSize()));
    TextView localTextView3 = (TextView)localView.findViewById(com.tencent.mm.i.ann);
    ImageView localImageView1;
    ImageView localImageView2;
    if ((paramString3 == null) || (paramString3.length() == 0))
    {
      localTextView3.setVisibility(8);
      localImageView1 = (ImageView)localView.findViewById(com.tencent.mm.i.anp);
      localImageView2 = (ImageView)localView.findViewById(com.tencent.mm.i.aHN);
      if (localImageView1 != null)
      {
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
          break label235;
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem4, thumbData is null");
        localImageView1.setVisibility(8);
      }
    }
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      localTextView3.setText(paramString3);
      localTextView3.setVisibility(0);
      break;
      label235: localImageView1.setVisibility(0);
      Bitmap localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
      localImageView1.setImageBitmap(localBitmap);
      a(localcn, localBitmap);
      if (localImageView2 != null)
      {
        localImageView2.setVisibility(0);
        switch (paramInt)
        {
        default:
          localImageView2.setVisibility(8);
          break;
        case 1:
          localImageView2.setImageResource(h.acH);
          break;
        case 2:
          localImageView2.setImageResource(h.Xe);
        }
      }
    }
  }

  public static cn a(cg paramcg, byte[] paramArrayOfByte, String paramString, boolean paramBoolean, aa paramaa)
  {
    return a(paramcg, paramArrayOfByte, paramString, paramBoolean, "", paramaa);
  }

  public static cn a(cg paramcg, byte[] paramArrayOfByte, String paramString1, boolean paramBoolean, String paramString2, aa paramaa)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem3 fail, imgData is null");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdq);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, paramBoolean);
    a(localView, paramcg);
    if (!ch.jb(paramString2))
      a(localView, com.tencent.mm.i.ang, paramString2);
    int i = e.a(paramcg.aPI(), 120.0F);
    Bitmap localBitmap = com.tencent.mm.sdk.platformtools.i.a(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length), i, i);
    a(localcn, localView, com.tencent.mm.i.anl, localBitmap, false);
    if ((paramString1 == null) || (paramString1.length() == 0))
      localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      ((TextView)localView.findViewById(com.tencent.mm.i.ann)).setText(paramString1);
    }
  }

  private static void a(View paramView, int paramInt, String paramString)
  {
    Button localButton = (Button)paramView.findViewById(paramInt);
    if (localButton != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if ((paramString != null) && (paramString.length() > 0))
        localButton.setText(paramString);
      return;
    }
  }

  private static void a(View paramView, int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    TextView localTextView = (TextView)paramView.findViewById(paramInt1);
    if (localTextView != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if ((!paramBoolean) || (!ch.jb(paramString)))
        break;
      localTextView.setVisibility(paramInt2);
      return;
    }
    localTextView.setText(paramString);
  }

  private static void a(View paramView, aa paramaa, cn paramcn)
  {
    ((Button)paramView.findViewById(com.tencent.mm.i.ang)).setOnClickListener(new u(paramaa, paramView, paramcn));
    Button localButton = (Button)paramView.findViewById(com.tencent.mm.i.anh);
    if (localButton != null)
      localButton.setOnClickListener(new v(paramaa, paramcn));
  }

  private static void a(View paramView, cg paramcg)
  {
    View localView = paramView.findViewById(com.tencent.mm.i.anj);
    if (localView != null)
      localView.setOnTouchListener(new y(paramcg, paramView));
  }

  private static void a(cn paramcn, Bitmap paramBitmap)
  {
    paramcn.setOnDismissListener(new z(paramBitmap));
  }

  private static void a(cn paramcn, View paramView, int paramInt, Bitmap paramBitmap, boolean paramBoolean)
  {
    ImageView localImageView = (ImageView)paramView.findViewById(paramInt);
    if (localImageView != null)
    {
      if ((paramBitmap == null) || (paramBitmap.isRecycled()))
        break label38;
      localImageView.setImageBitmap(paramBitmap);
      a(paramcn, paramBitmap);
    }
    label38: 
    while (!paramBoolean)
      return;
    localImageView.setVisibility(8);
  }

  private static void a(cg paramcg, cn paramcn)
  {
    try
    {
      if (!paramcg.aPI().isFinishing())
      {
        paramcn.setInputMethodMode(1);
        paramcn.setSoftInputMode(16);
        paramcn.setFocusable(true);
        paramcn.setTouchable(true);
        paramcn.showAtLocation(paramcg.aPI().getWindow().getDecorView(), 17, 0, 0);
      }
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "show dialog fail: %s", arrayOfObject);
    }
  }

  private static cn ad(View paramView)
  {
    return new cn(paramView, -1, -1);
  }

  public static cn b(cg paramcg, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, aa paramaa)
  {
    View localView = r(paramcg.aPI(), k.bdv);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    if (ch.jb(paramString2))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem8 fail,title or  message is empty");
      return null;
    }
    a(localView, com.tencent.mm.i.anr, paramString2, false, 0);
    TextView localTextView = (TextView)localView.findViewById(com.tencent.mm.i.anm);
    if (!ch.jb(paramString1))
      localTextView.setText(b.e(paramcg.aPI(), com.tencent.mm.model.y.dh(paramString1), (int)localTextView.getTextSize()));
    while (true)
    {
      a(localView, com.tencent.mm.i.ank, paramString4, true, 8);
      Button localButton = (Button)localView.findViewById(com.tencent.mm.i.ang);
      if (!ch.jb(paramString5))
        localButton.setText(paramString5);
      localButton.setOnClickListener(new t(paramaa, localView, localcn));
      if (!ch.jb(paramString1))
        com.tencent.mm.pluginsdk.ui.c.a((ImageView)localView.findViewById(com.tencent.mm.i.anp), paramString1);
      a(paramcg, localcn);
      return localcn;
      localTextView.setText(b.e(paramcg.aPI(), paramString3, (int)localTextView.getTextSize()));
    }
  }

  public static cn b(cg paramcg, String paramString1, String paramString2, boolean paramBoolean, aa paramaa)
  {
    return b(paramcg, paramString1, paramString2, paramBoolean, "", paramaa);
  }

  public static cn b(cg paramcg, String paramString1, String paramString2, boolean paramBoolean, String paramString3, aa paramaa)
  {
    if ((paramString1 == null) || (!com.tencent.mm.a.c.ac(paramString1)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem3 fail, img does not exist");
      return null;
    }
    View localView = r(paramcg.aPI(), k.bdq);
    cn localcn = ad(localView);
    a(localView, paramaa, localcn);
    c(localView, paramBoolean);
    a(localView, paramcg);
    if (!ch.jb(paramString3))
      a(localView, com.tencent.mm.i.ang, paramString3);
    int i = e.a(paramcg.aPI(), 120.0F);
    Bitmap localBitmap = com.tencent.mm.sdk.platformtools.i.a(paramString1, i, i, false);
    if (localBitmap == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKepPGwm75eZGp+z8yM8hRDu9y0dA4MRdc=", "showDialogItem3 fail, bmp is null");
      return null;
    }
    ((ImageView)localView.findViewById(com.tencent.mm.i.anl)).setImageBitmap(localBitmap);
    a(localcn, localBitmap);
    if ((paramString2 == null) || (paramString2.length() == 0))
      localView.findViewById(com.tencent.mm.i.ann).setVisibility(8);
    while (true)
    {
      a(paramcg, localcn);
      return localcn;
      ((TextView)localView.findViewById(com.tencent.mm.i.ann)).setText(paramString2);
    }
  }

  private static void c(View paramView, boolean paramBoolean)
  {
    EditText localEditText;
    if (paramView != null)
    {
      localEditText = (EditText)paramView.findViewById(com.tencent.mm.i.ano);
      if (localEditText != null)
        if (!paramBoolean)
          break label31;
    }
    label31: for (int i = 0; ; i = 8)
    {
      localEditText.setVisibility(i);
      return;
    }
  }

  private static View r(Context paramContext, int paramInt)
  {
    return ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(paramInt, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.r
 * JD-Core Version:    0.6.2
 */