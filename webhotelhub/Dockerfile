#FROM nginx:1.17.1-alpine
#COPY nginx/default.conf /etc/nginx/conf.d/default.conf
#COPY dist/webhotelhub /usr/share/nginx/html
#EXPOSE 80


# Angular Build Stage
FROM node:16.14.2-slim AS builder
WORKDIR /
COPY . /app
RUN npm install -g @angular/cli@15.0.3
RUN cd /app && npm install 
RUN cd /app && ng build --configuration=production

# Effective Stage
FROM nginx:alpine
#COPY nginx/default.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /app/dist/webhotelhub /usr/share/nginx/html
EXPOSE 80
