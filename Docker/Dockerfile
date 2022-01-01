FROM elasticsearch:7.16.2

RUN mkdir -p /usr/share/elasticsearch/config/hunspell/cs_CZ
WORKDIR /usr/share/elasticsearch/config/hunspell/cs_CZ
RUN curl https://raw.githubusercontent.com/ludekvesely/elasticsearch-tutorial/master/hunspell/cs_CZ/cs_CZ.aff -o cs_CZ.aff
RUN curl https://raw.githubusercontent.com/ludekvesely/elasticsearch-tutorial/master/hunspell/cs_CZ/cs_CZ.dic -o cs_CZ.dic
RUN curl https://raw.githubusercontent.com/ludekvesely/elasticsearch-tutorial/master/hunspell/cs_CZ/settings.yml -o settings.yml
RUN /usr/share/elasticsearch/bin/elasticsearch-plugin install analysis-icu
