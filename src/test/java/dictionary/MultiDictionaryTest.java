package dictionary;

import com.github.ignacy123.webdemo.domain.DictionaryFactory;
import com.github.ignacy123.webdemo.domain.MultiDictionary;
import com.github.ignacy123.webdemo.dto.TranslationResult;
import com.github.ignacy123.webdemo.service.DictionaryServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ignacy on 27.04.16.
 */
public class MultiDictionaryTest {
    private MultiDictionary multiDictionary;
    private DictionaryServiceImpl dictionaryService;

    @Before
    public void setUp() {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("dictionary.c5");
        multiDictionary = DictionaryFactory.createDictionaryFromC5InputStream(inputStream);
        dictionaryService = new DictionaryServiceImpl(multiDictionary);
    }

    @Test
    public void worksOk() {
        TranslationResult translationResultOne = dictionaryService.translate("apple");
        TranslationResult translationResultTwo = new TranslationResult();
        List testTranslations = new ArrayList<String>();
        testTranslations.add("jabłko");
        testTranslations.add("jabłoń");
        translationResultTwo.setTranslations(testTranslations);
        assertThat(translationResultOne, is(translationResultTwo));
    }
}
