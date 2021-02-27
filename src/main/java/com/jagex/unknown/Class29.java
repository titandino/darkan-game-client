package com.jagex.unknown;

import com.jagex.*;

public class Class29 {

	NewsItemFetcher newsItemFetcher;

	Index loadingFontIndex;

	Index fontMetricsIndex;

	public Class29(Index loadingFontIndex, Index fontMetricsIndex) {
		this.loadingFontIndex = loadingFontIndex;
		this.fontMetricsIndex = fontMetricsIndex;
	}

	public static void deleteItemContainer(int key, boolean negativeKey) {
		ItemContainer container = ItemContainer.getContainer(key, negativeKey);
		if (container != null)
			container.unlink();
	}

	public Interface2 method781(Interface3 interface3_1) {
		if (interface3_1 == null) {
			return null;
		} else {
			Class60 class60_3 = interface3_1.method24();
			return class60_3 == Class60.aClass60_609 ? new Class46((Class366) interface3_1) : (class60_3 == Class60.aClass60_605 ? new Class28(getNewsItemFetcher(), (Class365) interface3_1) : (class60_3 == Class60.aClass60_606 ? new Class42(loadingFontIndex, (Class357) interface3_1) : (class60_3 == Class60.aClass60_607 ? new Class42_Sub1(loadingFontIndex, (Class357_Sub1) interface3_1) : (class60_3 == Class60.aClass60_602 ? new Class52_Sub3(loadingFontIndex, fontMetricsIndex, (Class350_Sub2) interface3_1) : (class60_3 == Class60.aClass60_603 ? new Class52_Sub1(loadingFontIndex, fontMetricsIndex, (Class350_Sub1) interface3_1) : (class60_3 == Class60.aClass60_608 ? new Class52_Sub2(loadingFontIndex, fontMetricsIndex, (Class350_Sub3) interface3_1) : (class60_3 == Class60.aClass60_604 ? new Class51(loadingFontIndex, fontMetricsIndex, (Class62) interface3_1) : (class60_3 == Class60.aClass60_601 ? new Class43(loadingFontIndex, (Class351) interface3_1) : (class60_3 == Class60.aClass60_610 ? new Class52_Sub2_Sub1(loadingFontIndex, fontMetricsIndex, (Class350_Sub3_Sub1) interface3_1) : null)))))))));
		}
	}

	NewsItemFetcher getNewsItemFetcher() {
		if (newsItemFetcher == null)
			newsItemFetcher = new NewsItemFetcher();
		return newsItemFetcher;
	}
}
